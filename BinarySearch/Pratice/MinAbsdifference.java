public class MinAbsdifference {

    public static int minAbsdifference(int arr[], int target){
        int ans = 0;
        int start = 0; 
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                ans = mid;
                break;
            }
            else if(arr[mid]>target){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }

        // if(ans == -1){
        //     ans = Math.min(Math.abs(target-arr[start]), Math.abs(target-arr[end]));
        //     return ans;
        // }
        // return ans;

        int res = 0;
        if(ans == 0){
            if(end == -1){
                res = Math.abs(target-arr[start]);
            }
            else if(start == arr.length){
                res = Math.abs(target-arr[end]);
            }
            else{
                res = Math.min(Math.abs(target-arr[start]), Math.abs(target-arr[end]));
            }
            return res; 
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,8,13,15,17,19};
        System.out.println("MinAbsdifference:"+minAbsdifference(arr, 30));
    }
}
