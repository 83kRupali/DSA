public int[] shortestToChar(String s, char c) {
        int n = s.length();

        ArrayList<Integer>idx = new ArrayList<>();
        int ans[] = new int[n];

        for(int i=0; i<n; i++){
            if(s.charAt(i) == c)  idx.add(i);
        }

        for(int i=0; i<s.length(); i++){
            int min_dist = 100000;

            for(int j:idx){
                min_dist = Math.min(min_dist, Math.abs(j-i));
            }
            ans[i] = min_dist;
        }
        return ans;
    }
