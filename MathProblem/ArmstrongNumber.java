//package Apna_College.Math_dsa;

public class ArmstrongNumber {

    public static boolean isArmstrongNumber(int n){
        int copyN = n;

        int ans = 0;

        while(n != 0){
            int dig = n % 10 ;
            ans += (dig*dig*dig);
            n /= 10;    
        }

        return copyN == ans;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(111));
    }
    
}
