public class PeakElement {

    //smallest element in  array
    public static int peakElementsamll(int arr[]){
        if(arr[0]<=arr[arr.length-1]){
            return arr[0];
        }
        else{
            return arr[arr.length-1];
        }
    }

    // validate Bitonic Array
    // validate mountain Array
    //941
    //O(n)
    public static boolean peakElementBitonic(int arr[]){
        int idx = 0;
        int n = arr.length;
        //find all increasing seq (find the peak)

        while(idx < arr.length-1){
            if(arr[idx]  < arr[idx+1]){
                idx++;
            }
            else{
                break;
            }
        }

        if(idx == 0 || idx == n-1){
            return false;
        }

        //find all decreasing seq (find the peak)

        while(idx < arr.length-1){
            if(arr[idx] > arr[idx+1]){
                idx++;
            }
            else{
                break;
            }
        }
        return (idx == n-1);
    }

    // Peak element of array
    // 852
    // log(n)

    public static int peakElements(int arr[]){
        int n = arr.length;
        int st =0;
        int end = arr.length-1;


         while (st <= end) {
            int mid = st + (end-st)/2;

            if(mid != 0 && mid != n-1 && arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid != n-1 && arr[mid]<arr[mid+1]){
                st = mid+1;
            }
            else{
                end = mid -1;
            }
         }
        return -1;
    } 

    //1095
    public static int mountainArray(int arr[], int target){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int mid = -1;

        while (st <= end) {
            mid = st+(end-st)/2;

            int curr = arr[mid];


            if(mid != 0 && end != n-1 && curr > arr[mid-1] && curr>arr[mid+1]){
                if(curr == target){
                    return mid;
                }
                break;
            }else if(mid != n-1 && curr < arr[mid+1]){
                st = mid +1;
            }
            else{
                end = mid-1;
            }
        }

        // find in first half (increasing)
        
        st = 0;
        end = mid-1;

        while (st <= end) {
            int m = st + (end - st)/2;

            int curr = arr[m];

            if(curr == target){
                return m;
            }
            else if(target < curr){
                end = m-1;
            }
            else{
                st = m+1;
            }
        }

        // find in second half (decreasing)
        
        st = mid+1;
        end = n-1;

        while (st <= end) {
            int m = st + (end - st)/2;

            int curr = arr[m];

            if(curr == target){
                return m;
            }
            else if(target < curr){
                st = m+1;
            }
            else{
                end = m-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    }
}
