public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        HashMap<Character, Integer>map = new HashMap<>();
        StringBuilder str = new StringBuilder();

        for(int i=0; i<n; i++){

            char c = s.charAt(i);

            if(map.containsKey(c)){

                int idxInStr = str.indexOf(String.valueOf(c));

                if(idxInStr != -1){
                    str.delete(0, idxInStr + 1);
                }
            }    
            str.append(c);
            map.put(c, i);
            ans = Math.max(ans, str.length());
        }
        return ans;
    }
