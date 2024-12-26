//package Apna_College.Strings;

public class RemoveAllOccurrences {

    //leetcode : 1910

    public static String removeAllOccurrences(){
        String s = "daabcbaabcbc";
        String part = "abc";

         // Loop until no occurrence of 'part' is found in 's'
         while (s.length() > 0 && s.contains(part)) {
            // Find the index of 'part' and erase it by creating a new string without that part
            s = s.replaceFirst(part, "");
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(removeAllOccurrences());
    }
}
