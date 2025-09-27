public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer>ans = new ArrayList<>();
        ArrayList<Integer>path = new ArrayList<>();
        int n = arr.length;
        
        getAns(arr, ans, path, n);
        Collections.sort(ans);
        
        return ans;
        
    }

    public void getAns(int arr[], ArrayList<Integer>ans, ArrayList<Integer>path, int n){
        if(n == 0){
            int sum = 0;
            for(int i=0; i<path.size(); i++){
                sum += path.get(i);
            }
            ans.add(sum);
            return;
        }
        
        path.add(arr[n-1]);
        getAns(arr,ans, path, n-1);
        path.remove(path.size()-1);
        
        getAns(arr, ans, path, n-1);
    }
    
