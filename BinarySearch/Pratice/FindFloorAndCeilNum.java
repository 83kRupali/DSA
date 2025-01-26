public class FindFloorAndCeilNum {

    //744- ceiling order
    /*
     * Floor: greatest value equal to or smaller than target.
     * 
     * Ceil: smallest value equal to or greater than target.
     */

    public static int findFloorNum(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans = arr[mid];
                break;
            }
            else if(arr[mid]<target){
                start = mid+1;
                ans = arr[mid];
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }

    public static int ceilFloorNum(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans = arr[mid];
                break;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
                ans = arr[mid];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,9};
        int arr1[] = {2,3,4,7,9,10,12,13,15,16};
        int n = arr.length;

        System.out.println("Floor:"+findFloorNum(arr1,14));
        System.out.println("Ceil:"+ceilFloorNum(arr1, 14));
    }
}
