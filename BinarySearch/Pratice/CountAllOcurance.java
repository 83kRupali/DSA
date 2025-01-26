public class CountAllOcurance {

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
        int arr1[] = {1,1,2,3,4,4,5,5,6,6,6};
        int target = 6;
        int i = firstOccrance(arr1, target);
        int j = LastOccrance(arr1, target);

        if(i == -1){
            System.out.println("Occurance is not found...");
        }
        else{
            int count = j - i + 1;
            System.out.println("Count:"+count);
        }        
    }
}
