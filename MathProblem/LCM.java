//package Apna_College.Math_dsa;

public class LCM {

    public static int gcd2(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd2(b, a%b);
    }

    public static void lcm(int a, int b){
        int lcmm = (a*b)/gcd2(a, b);
        System.out.println("LCM:"+lcmm);
    }
    public static void main(String[] args) {
        lcm(20, 28);
    }
}
