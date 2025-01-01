
public class BinarySearch {

    //time complexity: O(logn)
    //iterative
    public static void binarySearch(){
        int arr[] = {-1,0,3,4,5,6,9,12};
        int target = 12;
        int n = arr.length;

        int st = 0;
        int end = n-1;

        while (st <= end) {    // <= it is for single element
            int mid = st+(end-st)/2;

            if(arr[mid] == target){
               System.out.println("found:"+mid);
               break;
            }
            else if(arr[mid]<target){
                st = mid+1;
            }
            else{
                end = mid -1;
            }
        }
    }

    //with recursive
    public static int binarySearch1(int arr[], int st, int end, int target){

        if(st<=end){
        
            int mid = st+(end-st)/2;

            if(arr[mid] == target){
               return mid;
            }
            else if(arr[mid]<target){
                return binarySearch1(arr, mid+1, end, target);
            }
            else{
                return binarySearch1(arr, st, mid-1, target);
            }
        }
            return -1;
    }

    public static void binarySearch2(){
        int arr[] = {-1,0,3,4,5,6,9,12};
        int target = 12;
        int n = arr.length;

        int ans =  binarySearch1(arr, 0, n-1, target);
        System.out.println("found:"+ans);
    }
    public static void main(String[] args) {
        binarySearch();
        binarySearch2();
        
    }
}
