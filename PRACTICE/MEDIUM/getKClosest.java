public ArrayList<Integer> getKClosest(Node root, int target, int k) {
        // code here
        ArrayList<Integer>arr = new ArrayList<>();
        
        if(root == null) return arr;
        
        getAns(root, arr);
        
        int i = 0;
        for(int idx=0; idx<arr.size(); idx++){
            if(Math.abs(arr.get(idx) - target) < Math.abs(arr.get(i) - target)){
                i = idx;
            }
        }
        
        ArrayList<Integer>res = new ArrayList<>();
        int left = i-1;
        int right = i+1;
        int n = arr.size();
        k--;
        res.add(arr.get(i));
        
        while(k>0 && (left >= 0 || right <n)){
            
            if(left < 0){
                res.add(arr.get(right++));
            }
            else if(right >= n){
                res.add(arr.get(left--));
            }
            else {
                
                int leftd = Math.abs(arr.get(left) - target);
                int rightd = Math.abs(arr.get(right) - target);
                
                if(leftd <= rightd){
                    res.add(arr.get(left--));
                }
                else{
                    res.add(arr.get(right++));
                }
            }
            
            k--;
        }
        
        Collections.sort(res);
        return res;
        
    }
    
    
    public void getAns(Node root, ArrayList<Integer>arr){
        if(root == null) return;
        
        getAns(root.left, arr);
        arr.add(root.data);
        getAns(root.right, arr);
    }
