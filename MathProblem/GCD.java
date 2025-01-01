//package Apna_College.Math_dsa;

public class GCD {

    public static int gcd1(int a, int b){
        while(a>0 && b>0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        if(a == 0){
            return b;
        }
        return a;
    }

    public static int gcd2(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd2(b, a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcd1(20, 28));
        System.out.println(gcd2(20, 28));
    }
}
