//package Apna_College.Strings;

public class ReverseWordInString {

    //leetcode - 151
    // Time Complexity: (n)
    public static String reverseWordInString(){
        String str = "  the pen  rupali   ramteke";

        int n = str.length();
        StringBuilder st = new StringBuilder(str);
        st.reverse();

        StringBuilder ans = new StringBuilder();

        for(int i=0; i<n; i++){
            StringBuilder word = new StringBuilder();

            while (i<n && st.charAt(i) !=' ') {
                word.append(st.charAt(i));
                i++;
            }

            word.reverse();
            if(word.length() > 0){
                ans.append(word+" ");
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseWordInString());
    }
}
