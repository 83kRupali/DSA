public class Median2SortArray {

    // 4 median of two sorted Arrays
    public static double median2SortArray(int arr1[], int arr2[]){

        // make num1 as min length array
        // call same function, and change smaller
        // if nums1 was freater and num2 was smaller
        // so beacuse of we swapped these two, now num1 is smaller and num2 is greater

        if(arr1.length > arr2.length){
            return median2SortArray(arr2, arr1);
        }

        // num1 is smaller and num2 is greater
        int n1 = arr1.length;
        int n2 = arr2.length;
        int N = (n1+n2)/2;
        int st = 0;
        int end = n1;

        while (st <= end) {
            // mid --> cut1
            int cut1 = st + (end - st)/2;

            // cut2 
            int cut2 = N - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE:arr1[cut1-1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE:arr2[cut2-1];
            int r1 = (cut1 == n1) ? Integer.MAX_VALUE:arr1[cut1];
            int r2 = (cut2 == n2) ? Integer.MIN_VALUE:arr2[cut2];

            //check if cut is valid
            if(l1 <= r2 && l2 <= r1){
                // if N is odd, 1

                if(N % 2 != 0){
                    return (double)Math.min(r1, r2);
                }
                // else if N is even, 2
                else{
                    return (double)((Math.max(l1, l2)+Math.min(r1, r2))/2.0);
                }
            } 
            else if(l1 > r2){
                end = cut1-1;
            }
            else{
                st = cut1+1;
            }
        }
        return 0.0;

    }
    public static void main(String[] args) {
        int arr1[] ={2,4,9,12};
        int arr2[] ={5,6,8,13};
        // arr[] = {2,4,5,6,8,9,12,13};
        System.out.println("Median:"+median2SortArray(arr1, arr2));
    }
}
