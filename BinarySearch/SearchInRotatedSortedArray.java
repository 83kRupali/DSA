public class SearchInRotatedSortedArray {

    // 33 - leetcode
    //Search in Rotated Sorted Array
    //Time COmplexity : O(logn) 
    
    public static int searchInRotatedSortedArray(){
        int arr[] = {3,4,5,6,7,0,1,2};    
        int target = 0;
        int n =arr.length;
        
        int st = 0;
        int end = n-1;

        while (st <= end) {
            int mid = st + (end - st)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[st] <= arr[mid]){
                if(arr[st] <= target && target <= arr[mid]){
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
            else{
                if(arr[mid] <= target && target <= arr[end]){
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(searchInRotatedSortedArray());
    }
}
