 /*
     actual time: 1.3
     TC: O(nlogn)
     SC: O(n)
    */
    static void relativeSort1(int[] a1, int[] a2) {
        // code here
        
        HashMap<Integer, Integer>map = new HashMap<>();
        
        // count frequescy of a1 
        for(int i:a1){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        ArrayList<Integer>arr = new ArrayList<>();
        
        int idx = 0;
        for(int x:a2){
            int count = map.getOrDefault(x, 0);
            
            while(count-- > 0){
                a1[idx++] = x;
            }
            
            map.remove(x);
        }
        
        // Store remaining elements
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int val = entry.getKey();
            int freq = entry.getValue();
            
            while(freq-- > 0){
                arr.add(val);
            }
        }
        
        
        Collections.sort(arr);
        
        for(int k : arr){
            a1[idx++]=k;
        }
    }
    
    
    
    /*
     actual time: 1.2
     TC: O(nlogn)
     SC: O(n)
    */
    static void relativeSort2(int[] a1, int[] a2) {
        // code here
        
        TreeMap<Integer, Integer>map = new TreeMap<>();
        
        // count frequescy of a1 
        for(int i:a1){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        int idx = 0;
        for(int x:a2){
            int count = map.getOrDefault(x, 0);
            
            while(count-- > 0){
                a1[idx++] = x;
            }
            
            map.remove(x);
        }
        
        // Store remaining elements
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int val = entry.getKey();
            int freq = entry.getValue();
            
            while(freq-- > 0){
                a1[idx++] = val;
            }
        }
    }
    
    
        /*
     actual time: 0.91
     TC: O(n)
     SC: O(max value)
    */
    static void relativeSort(int[] a1, int[] a2) {
        // code here
        int max = 100000;
        int freq[] = new int[max+1];
        
        //Count frequency
        for(int x:a1){
            freq[x]++;
        }
        
        int idx = 0;
        
        //Place elements from a2
        for(int x: a2){
            while(freq[x]-- > 0){
                a1[idx++] = x;
            }
        }
        
        //Place remaining elements
        for(int i=0; i<=max; i++){
            while(freq[i]-- > 0){
                a1[idx++] = i; 
            }
        }
    }
