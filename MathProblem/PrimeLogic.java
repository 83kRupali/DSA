//package Apna_College.Math_dsa;

import java.util.Arrays;

public class PrimeLogic {

    public static String isPrime(int n){
        for(int i=2; i*i<n; i++){
            if(n%i==0){
                return "Not Prime";
            }
        }
        return "Prime";
    }

    public static int isPrimeRange(int n){
        boolean isPrime[] = new boolean[n];
        Arrays.fill(isPrime, true);
        int count = 0;

        for(int i=2; i<n; i++){
            if(isPrime[i]){
                count++;

                for(int j=i*2; j<n; j=j+i){
                    isPrime[j] = false;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(6));
        System.out.println(isPrimeRange(50));
    }
}
