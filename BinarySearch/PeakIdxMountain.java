public class PeakIdxMountain {

    //leetCode : 852
    // Peak Index in Mountain Array
    // Time Complexity - O(logn)
    public static int peakIdxMountain(){
        int arr[] = {0,3,10,7,5,2};
        int n = arr.length;

        int st = 1;
        int end = n-2;

        while(st <= end){
            int mid = st+(end-st)/2;

            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }

            if(arr[mid-1]<arr[mid]){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(peakIdxMountain());
    }
}
