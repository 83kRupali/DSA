public class KthEle2SortArray {

    //K-th element of two sorted Arrays

    public static long kthEle2SortArray(int arr1[], int arr2[], int k){

        if(arr1.length>arr2.length){
            return kthEle2SortArray(arr2, arr1, k);
        }
        int n1 = arr1.length; 
        int n2 = arr2.length;

         //   int N = (n1+n2)/2;
        int st = Math.max(0, k-n2);
        int end = Math.min(k, n1);

        while(st <= end){
            int cut1 = st + (end - st)/2;

            int cut2 = k - cut1;

                // l1 , l2 r1 r2

            int l1 = (cut1 == 0)? Integer.MIN_VALUE:arr1[cut1-1]; 
            int l2 = (cut2 == 0)? Integer.MIN_VALUE:arr2[cut2-1]; 
            int r1 = (cut1 == n1)? Integer.MAX_VALUE:arr1[cut1]; 
            int r2 = (cut2 == n2)? Integer.MAX_VALUE:arr2[cut2]; 

                //ckeck if cut is valid

            if(l1 <= r2 && l2 <= r1){
                    // if N is odd, only one median
                return (Math.max(l1, l2));
            }
            else if(l1 > l2){
                end = cut1-1;
            }
            else{
                st = cut1+1;
            }
        }
            return 0;
    }
    
    public static void main(String[] args) {
        int arr1[] = {2,3,6,7,9};
        int arr2[] = {1,4,8,10};
        System.out.println("Kth Element: "+kthEle2SortArray(arr1, arr2, 8));

    }
}