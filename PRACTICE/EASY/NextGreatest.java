static ArrayList<Integer> nextGreatest(int arr[]) {
        // code here
        int n = arr.length;
        
        ArrayList<Integer>res = new ArrayList<>();
        
        int num = 0;
        res.add(-1);
        res.add(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            int size =res.size();
            if(arr[i] < res.get(size-1)){
                res.add(res.get(size-1));
            }
            else{
                res.add(arr[i]);
            }
        } 
        
        Collections.reverse(res);
        res.removeFirst();
        return res;
    }
