public class MinimizedMaxPro {

    // 2064: Minimized Maximum of products Distributed to Any Store

    public static int minimizedMaxPro(int arr[], int target){
        int ans = -1;

        int st = 1;      //to avoid divide by zero error
        int end = arr[0];  // for finding the max value
        
        for(int i=0; i<arr.length; i++){
            end = Math.max(end, arr[i]);
        }

        while (st <= end) {
            int mid = st + (end - st)/2;

            if(isPossible( arr, mid, target)){
                ans = mid;
                end = mid -1;
            }
            else{
                st = mid+1;
            }
        }

        return ans;
    }

    public static boolean isPossible(int arr[], int maxprod, int target){
        int shop = 0;

        for(int i=0; i<arr.length; i++){
            shop  += arr[i]/maxprod;

            if((arr[i]/maxprod) != 0){
                shop++;
            }
        }

        if(shop > target){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] ={11,6};   // product
        int shop = 6;
        //ans = 4;
        System.out.println(minimizedMaxPro(arr, shop));

    }   
}
