// User function Template for Java

class SmallestSubWithSum {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int n = arr.length;
        int ans = n+1;
        
        for(int i=0; i<n; i++){
            
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
                
                if(sum > x){
                    ans = Math.min(ans, j-i+1);
                    break;
                }
            }
        }
        
        return (ans == n+1) ? 0 : ans;
    }
}
