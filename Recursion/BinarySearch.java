public class BinarySearch {

    //TC : O(logn)
    //SC : O(logn)

    public static boolean binarySearch(int arr[],int st ,int end, int target){

        if(st <= end) {
            int mid = st + (end-st)/2;

            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] <= target){
                return binarySearch(arr, mid+1, end, target);
            }
            else{
               return binarySearch(arr, st, mid+1, target);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,5,7,8,9};
        System.out.println(binarySearch(arr, 0, arr.length-1, 10));
    }
}
