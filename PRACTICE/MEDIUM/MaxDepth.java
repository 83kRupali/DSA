public int maxDepth(String s) {
        int cnt = 0;
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            if(cnt != 0){
                ans = Math.max(ans, cnt);
            }
            
            if(s.charAt(i) == ')'){
                cnt--;
            }
            if(s.charAt(i) == '('){
                cnt++;
            }
        }
        return ans;
    }
