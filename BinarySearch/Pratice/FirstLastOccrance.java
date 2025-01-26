public class FirstLastOccrance {

    // 34 leetcode
    public static int firstOccrance(int arr[], int target){
        int n = arr.length;
        int ans = 0;
        boolean isFirst = false;
        int start = 0;
        int end = n-1;
        
        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans = mid;
                isFirst = true;
                if(isFirst){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
            
        }
        return ans;

    }

    public static int LastOccrance(int arr[], int target){
        int n = arr.length;
        int ans = 0;
        boolean isFirst = false;
        int start = 0;
        int end = n-1;
        
        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans = mid;
                isFirst = true;
                if(isFirst){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
            
        }
        return ans;

    }
    public static void main(String[] args) {
        int arr1[] = {1,1,2,3,3,4,5,5,5,6};
        int target = 5;
        System.out.println("First Occurance:"+firstOccrance(arr1, target));
        System.out.println("Last Occurance:"+LastOccrance(arr1, target));

    }
}
