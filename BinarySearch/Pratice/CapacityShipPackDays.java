public class CapacityShipPackDays {

    // 1011 : capacity to ship package within D Days
    public static int capacityShipPackDays(int arr[] , int days){
       // int st = Integer.MIN_VALUE;
       int st = arr[0];
        int ans = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            st = Math.max(arr[i], st);
            sum += arr[i];
        }

        int end = sum;
        while (st<=end) {
            int mid = st + (end-st)/2;

            if(isPossible(arr, mid, days)){
                ans = mid;
                end = mid-1;
            }

            else{
                st = mid+1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int arr[],int mid, int days){
        int pages = 0; int student = 1;

        for(int i=0; i<arr.length; i++){
            if(pages+arr[i]<=mid){
                pages +=arr[i];
            }
            else{
                pages = arr[i];
                student++;
            }
        }
        // boolean reusult = student == stu ? true:false;
        return student <= days ? true:false;
    
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(capacityShipPackDays(arr, days));
    }
}
