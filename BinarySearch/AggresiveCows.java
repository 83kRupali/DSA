import java.util.Arrays;

public class AggresiveCows {
    //* Assign C cows to N stalls such that min distance between them is largest possible. Return largest minimum distance.
     
    public static int aggresiveCows(){
        int arr[] = {1,2,8,4,9};  int c = 3;
        int n = 5;

        Arrays.sort(arr);  //O(nlogn)

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        int st = min, end = max,  ans = -1;
        while (st <= end) {    //O(log(range)*N)
            int mid = st + (end -st)/2;

            if(isPossible(arr, c, n, mid)){
                ans = mid;
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int arr[], int c, int n, int minAllowedDist){

        int laststallpos = arr[0], cows = 1;

        for(int i=1; i<n; i++){   //O(n)
            if( arr[i]-laststallpos >= minAllowedDist ){
                cows++;
                laststallpos = arr[i];
            }

            if( cows == c ){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(aggresiveCows());
    }
}
