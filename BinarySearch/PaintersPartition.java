public class PaintersPartition {

    // * Painters Partition problem
    //  * 
    //  * Given are N boards of length of each given in the form of array. and M painters, such that each painter takes 1 unit of time to paint 1 unit of time to paint 1 unit of th board.
    //  * 
    //  * The task is to find the minimum time to all boards under the contraints that any painter will only paint continuous sections of boards.
    //  * 

    //Time Complexity: O(log(sum)+n)
    public static int paintersPartition(){
        int arr[] = {40, 30, 10, 20};
        int m = 2;
        int n = 4;

        int maxVal = Integer.MIN_VALUE;     
        int sum = 0;

        for(int i=0; i<n; i++){    //O(n)
            maxVal = Math.max(maxVal, arr[i]);
            sum += arr[i];
        }

        int st = maxVal, end = sum, ans = -1;

        while(st <= end){      //log(range)
            int mid = st +(end-st)/2;

            if(isPossible(arr, m, n, mid)){
                ans = mid;
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int arr[], int m , int n, int maxAllowedTime){
        int painters = 1, time = 0;

        for(int i=0; i<n; i++){  //log(n)
            if(time+arr[i] <= maxAllowedTime){
                time += arr[i];
            }
            else{
                painters++;
                time = arr[i];
            }
        }

        if(painters <= m){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(paintersPartition());
    }
}