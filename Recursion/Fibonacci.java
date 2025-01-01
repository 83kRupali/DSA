public class Fibonacci {

    //leetcode: 509
    //nth term of fibonacci
    //Time Complexity: O(2^n)
    
    public static int fibonacci(int n){
        if(n==0 || n == 1){
            return n;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
}
