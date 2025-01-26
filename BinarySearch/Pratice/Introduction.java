//package SLASHCODE.BinarySearch;

public class Introduction {

    public static int binarySearch(int arr[], int target){
        int n = arr.length;
        int strat = 0;
        int end = n-1;

        while (strat <= end) {
            int mid = strat + (end-strat)/2;

            if(arr[mid] == target){
                return mid;
            }

            else if(arr[mid] < target){
                strat = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static int decbinarySearch(int arr[], int target){
        int n = arr.length;
        int strat = 0;
        int end = n-1;

        while (strat <= end) {
            int mid = strat + (end-strat)/2;

            if(arr[mid] == target){
                return mid;
            }

            else if(arr[mid] < target){
                end = mid-1;
            }
            else{
                strat = mid+1;
            }
        }
        return -1;
    }

    public static void orderAgnosticBS(int arr1[], int target){
        int strat = 0;
        int end = arr1.length;

        if(arr1[strat]<=arr1[end]){
            System.out.println("increasing order.............");
            binarySearch(arr1, target);
        }
        else{
            System.out.println("decreasing order..........");
            decbinarySearch(arr1, target);
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 6;
        System.out.println("Found index:"+binarySearch(arr, target));
        int arr1[] = {9,8,7,6,5,4,3,2,1};
        int target1 = 6;
        System.out.println("Found index:"+decbinarySearch(arr1, target1));
    }
}
