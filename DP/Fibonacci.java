
class Fibonacci{

    // Time Complexity : Exponential
    public static int fibonacci1(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return fibonacci1(n-1)+fibonacci1(n-2);
    }

    // Time Complexity : O(n) 
    // momoization (Top Down)
    public static int fibonacci2(int n,int f[]){
        if(n == 0 || n == 1){
            return n;
        }

        if(f[n] != 0) return f[n];

        f[n] = fibonacci2(n-1, f)+fibonacci2(n-2, f);

        return f[n];
    }

    // Tabulation (Bottom Up)
    public static int fibonacci3(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];   //ans
    } 
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibonacci1(n));

        int f[] = new int[n+1];
        System.out.println(fibonacci2(n, f));

        System.err.println(fibonacci3(n));
    }
}