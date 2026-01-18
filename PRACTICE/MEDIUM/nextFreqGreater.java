    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        // code here
        ArrayList<Integer>ans = new ArrayList<>();
        
        HashMap<Integer, Integer>map = new HashMap<>();
        
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
            ans.add(-1);
        }
        
        Stack<Integer>stack = new Stack<>();
       // int freq = map.get(arr[arr.length-1]);

        
        for(int i=arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && map.get(arr[stack.peek()]) <= map.get(arr[i])){
                stack.pop();
            }
            
            if(!stack.isEmpty()){
                ans.set(i, arr[stack.peek()]);
            }
            stack.push(i);
        }
        return ans;
    }
