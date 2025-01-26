public class SingleEleSortArray {

    //540 : Single Elements in a sorted Array

    public static int singleEleSortArray(int arr[]){
        int st = 0;
        int end = arr.length - 2;

        while (st <= end) {
            int mid = st + (end - st)/2;

            // left half -> move towards right
            if(arr[mid] == arr[mid^1]){
                st = mid + 1;
            }           
            else{
                end = mid - 1;
            }
        }
        return arr[st];
    }


    public static void main(String[] args) {
        int arr[] = {2,2,4,4,5,6,6,7,7,7,7,8,8};
        System.out.println(singleEleSortArray(arr));
    }
}
