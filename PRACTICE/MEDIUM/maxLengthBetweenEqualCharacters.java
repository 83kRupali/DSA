 // APPROACH-1
    // public int maxLengthBetweenEqualCharacters(String s) {
    //     HashMap<Character, Integer>map = new HashMap<>();
    //     int ans = -1;
    //     for(int i=0; i<s.length(); i++){
    //         char ch = s.charAt(i);

    //         if(map.containsKey(ch)){
    //             ans = Math.max(ans, i-map.get(ch)-1);
    //         }
    //         else{
    //             map.put(ch, i);
    //         }
    //     }

    //     return ans;
    // }

    // APPROACH-2
    public int maxLengthBetweenEqualCharacters(String s) {
        int n = s.length() , ans = -1; 
        char ch[] = s.toCharArray();
        int arr[] = new int[26];
        Arrays.fill(arr , -1);

        for(int i = 0 ; i < n ; i++){
            if(arr[ch[i] - 'a'] != -1){
                ans = Math.max(ans , i - arr[ch[i] - 'a'] - 1);
            }
            else arr[ch[i] - 'a'] = i;
        }

        return ans;
    }
