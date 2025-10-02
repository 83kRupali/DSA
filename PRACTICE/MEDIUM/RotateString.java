public boolean rotateString(String s, String goal){
        int n1 = s.length();
        int n2 = goal.length();

        if(n1 != n2) return false;
        
        boolean ans = false;
        for(int j=0; j<n2; j++){
            String str1 = goal.substring(0, j+1);
            String str2 = goal.substring(j+1, n2);
            String str = str2+str1;
            if(s.equals(str)){
                ans = true;
            }
        }
        return ans;
    }
