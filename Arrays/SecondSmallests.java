public class SecondSmallests {

    public static int[] secondSmallests(int arr[]){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] > first && arr[i] < second){
                second = arr[i];
            }
        }

        if(second == Integer.MAX_VALUE){
            return new int[]{-1};
        }

        return new int[]{first, second};
    }
    public static void main(String args[]){
        int arr[] ={2,4,3,5,6};
        int ans[] = secondSmallests(arr);

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();

        int arr1[] ={1,1,1};
        int ans1[] = secondSmallests(arr1);

        for(int i=0; i<ans1.length; i++){
            System.out.print(ans1[i]+" ");
        }
        System.out.println();
    }
}