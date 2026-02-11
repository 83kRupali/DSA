public static String[] winner(String arr[], int n) {
        
        String res= "";
        int max = 0;
        
        HashMap<String, Integer>map = new HashMap<>();
        
        for(String str: arr){
            int count = map.getOrDefault(str, 0)+1;
            
            if(max == count){
                if(res.compareTo(str)>0){
                    res = str;
                }
            }
            else if(max < count){
                res = str;
                max = count;
            }
            
            map.put(str, count);
        }
        
        String ans[] = new String[2];
        
        ans[0] = res;
        ans[1] = String.valueOf(max);
        return ans;
        
    }
