public class CheckArraySorted{

    // TC : O(n)
    // SC : O(n)
    public static boolean checkArraySorted(int arr[], int n){
        if(n == 0 || n == 1){
            return true;
        }

        return arr[n-1] >= arr[n-2] && checkArraySorted(arr, n-1);
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4};
        System.out.println(checkArraySorted(arr, arr.length));
    }
}
