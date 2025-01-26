public class FindSmallDivisior {

    // 1283 Find the Smallest Divisor Given a Thresold 

    public static int findSmallDivisior(int arr[], int thresold){
        int start = 1;
        int end = arr[0];

        // find the maxmium possible divisor

        for(int i=0; i<arr.length; i++){
            end = Math.max(arr[i], end);
        }

        int ans = -1;

        while (start <= end) {
            int mid = start +(end -start)/2;

            if(isPossible(arr, mid, thresold)){
                ans = mid;
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }

        return ans;
    }

    public static boolean isPossible(int arr[], int mid, int thresold){
        int sumOfDiv = 0;

        for(int i=0; i<arr.length; i++){
            sumOfDiv += arr[i]/mid;

            if(arr[i]%mid != 0){
                sumOfDiv +=1;
            }
        }

        if(sumOfDiv>thresold){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,5,9};
        int thresold = 6;
        System.out.println(findSmallDivisior(arr, thresold));

    }
}
