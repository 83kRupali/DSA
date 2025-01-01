import java.util.ArrayList;

public class PalindromePartitioning {

    //leetcode:131
    public static void palindromePartitioning(String str, ArrayList<String>partition, ArrayList<ArrayList<String>>ans){
        if(str.length() == 0){
            ans.add(new ArrayList<>(partition));
            return;
        }

        for(int i=0; i<str.length();  i++){
            String part = str.substring
            (0, i+1);
            if(isPalindrome(part)){
                partition.add(part);
                palindromePartitioning(str.substring(i+1), partition, ans);
                partition.remove(partition.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String str){
        String reversed = new StringBuilder(str).reverse().toString(); // Reverse the string
        return str.equals(reversed); 

    }
    public static void main(String[] args) {
        String str="aab";

        ArrayList<String>partition = new ArrayList<>();

        ArrayList<ArrayList<String>>ans = new ArrayList<>();
        
        palindromePartitioning(str, partition, ans);

        for(ArrayList<String> str1 :ans){
           System.out.println(str1);
        }
    }
}
