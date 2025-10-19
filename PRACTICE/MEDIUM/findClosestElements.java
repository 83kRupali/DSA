public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length; 
        int i = 0;
        for(int idx=0; idx<n; idx++){
            if(Math.abs(arr[idx] - x) < Math.abs(arr[i] - x)){
                i = idx;
            }
        }
        
        List<Integer>res = new ArrayList<>();
        int left = i-1;
        int right = i+1;
        k--;
        res.add(arr[i]);
        
        while(k>0 && (left >= 0 || right <n)){
            
            if(left < 0){
                res.add(arr[right++]);
            }
            else if(right >= n){
                res.add(arr[left--]);
            }
            else {
                
                int leftd = Math.abs(arr[left] - x);
                int rightd = Math.abs(arr[right] - x);
                
                if(leftd <= rightd){
                    res.add(arr[left--]);
                }
                else{
                    res.add(arr[right++]);
                }
            }
            k--;
        }
        
        Collections.sort(res);
        return res;
    }
