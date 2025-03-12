public class ModularExponentiation {

    public static int modularExponentiation(int a, int n, int x){
        int ans = 1;

        //Reduce 'a' initially in case it's greater than x;
        a = a%x;

        while(n > 0){
            if((n & 1) != 0){

                // If n is odd, multiply ans with a 
                ans = (ans * a)%x;
            }

            // square a under modulo
            a = (a * a)%x;

            // Right shift n (divisible by 2)
            n = n >> 1;
        }

        // ans is already mod x;
        return ans%x;
    }

    public static void main(String[] args) {
        System.out.println(modularExponentiation(2, 10, 3));
        System.out.println(modularExponentiation(2, 10, 2));
    }
}
