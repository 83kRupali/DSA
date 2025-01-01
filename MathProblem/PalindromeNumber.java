//package Apna_College.Math_dsa;

public class PalindromeNumber {


    public static int reverseNumber(int n){

        int reverse = 0;

        while (n>0) {
            int num = n % 10;
            reverse = reverse*10 + num;
            n /= 10;
        }
        return reverse;
    }

    public static boolean palindromeNumber(int n){
        if(n<0){
            return false;
        }

        int revNum = reverseNumber(n);

        return revNum == n;
    }
    public static void main(String[] args) {
        System.out.println(palindromeNumber(123));
        System.out.println(palindromeNumber(12321));
    }
}
