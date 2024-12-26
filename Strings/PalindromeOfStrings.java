//package Apna_College.Strings;

public class PalindromeOfStrings {

    // leectcode:125
    //Valid Palindrome
    
    public static boolean palindromeOfStrings(){

       // String str ="Ac3?e3c&a";

        String str ="Ace&a";
        int st =0;
        int end = str.length()-1;

        while(st<end){
            if (!isAlphanumeric(str.charAt(st))) {
                st++;
                continue;
            }
            if(!isAlphanumeric(str.charAt(end))){
                end++;
                continue;
            }

            if(Character.toLowerCase(str.charAt(st)) != Character.toLowerCase(str.charAt(end))){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }

    public static boolean isAlphanumeric(char ch){
        if((ch >= '0' && ch<= '9') || (Character.toLowerCase(ch)>='a' && Character.toLowerCase(ch)<='z')){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(palindromeOfStrings());

    }
}
