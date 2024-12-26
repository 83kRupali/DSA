//package Apna_College.Strings;

public class StringCompression {

    //string Compresssion:443

    public static int stringCompression(){
        char chars[] ={'a','a','b','b','c','c','c','c','a'};
        int n = chars.length;

        int idx = 0;

        for(int i=0; i<n; i++){
            char ch =chars[i];
            int count = 0;

            while (i<n && chars[i] == ch) {
                count++;  i++;
            }

            if(count == 1){
                chars[idx++] = ch;
            }
            else{
                chars[idx++] = ch;

                String str1 = Character.toString(count);
                
                chars[idx++] = str1.charAt(0);
            }
            i--;
        }
        return idx;
    }

    public static void main(String[] args) {
        System.out.println(stringCompression());
    }
    
}
