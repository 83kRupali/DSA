//package Apna_College.Strings;

public class PermutationInStrings {

    public static boolean isFreqSame(int freq1[], int freq2[]){    // O(1)

        for(int i=0; i<26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean permutationInStrings(){
        String s1 = "ab";
        //String s2 = "eidbaooo";
        String s2 ="eidboaoo";

        int freq[] = new int[26];

        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i)-'a']++;
        }

        int windSize = s1.length();

        for(int i=0; i<s2.length(); i++){
            int windIdx = 0,  idx = i;

            int windFreq[] = new int[26];

            // one index frequency

            while (windIdx < windSize && idx < s2.length()) {
                windFreq[s2.charAt(idx) - 'a']++;
                windIdx++; idx++;
            }

            if(isFreqSame(freq, windFreq)){   //found
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(permutationInStrings());
    }    
}
