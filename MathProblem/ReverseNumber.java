//package Apna_College.Math_dsa;

public class ReverseNumber {

    public static int reverseNumber(int n){

        int reverse = 0;
        while (n>0) {
            int num = n % 10;

            if(reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10){
                return 0;
            }
            
            reverse = reverse*10+num;
            n /= 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverseNumber(1234));
        
    }
}
