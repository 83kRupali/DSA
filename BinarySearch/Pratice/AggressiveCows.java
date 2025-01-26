import java.util.Arrays;

public class AggressiveCows {

    ///max of min
    public static int aggressiveCows(int arr[], int cows){
        if(arr.length < cows){
            return -1;
        }

        Arrays.sort(arr);
        int st = 1;
        int end = arr[arr.length-1] - arr[0];
        
        int ans = -1;

        while (st <= end) {
            int mid = st + (end -st)/2;

            if(isPossible(arr, mid , cows)){
                ans = mid;
                st = mid+1;
            }
            else{
                end = mid -1;
            } 
        }
        return ans;
    }

    public static boolean isPossible(int arr[], int mindistance, int cows){
        int cousCount = 1;
        int latcowsdist = arr[0];

        for(int i=1; i<arr.length; i++){

            // check min distanc

            if(arr[i] - latcowsdist >= mindistance){
                cousCount++;
                latcowsdist = arr[i];
            }
        } 

        if(cousCount >= cows){
            return true;
        }
        return false;


    }

    public static void main(String args[]){
        int arr[] = {1,2,4,8,9};
        int cows = 3;
        // ans - 3
        System.out.println(aggressiveCows(arr, cows));

    }
}
