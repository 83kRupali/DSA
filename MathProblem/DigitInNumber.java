//package Apna_College.Math_dsa;

public class DigitInNumber {

    //Time complexity : O(log(base10)n)
    public static void digitInNumber(int num){
        int count = 0;
        while(num>0){
            int number = num % 10;
            count++;
            System.out.print(number+" ");
            num /= 10;
        }
        System.out.println();
        System.out.println("Count:"+count);
    }
    public static void main(String[] args) {
        
        digitInNumber(1234);
        //System.out.println(log10(1234)+1);
    }
}
