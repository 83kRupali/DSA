  /*
          APPROACH - I
          TC:O(n)
          SC:O(n)   --> hashset
          
          if last element is very large the worst case
    */
    public int kthMissing2(int[] arr, int k) {
        // code here
        
        HashSet<Integer>set = new HashSet<>();
        
        for(int i:arr){
            set.add(i);
        }
        
        int i=0;
        
        for(i=1; i<=arr[arr.length-1]; i++){
            
            if(!set.contains(i)){
                k--;
                if(k==0) return i;
            }
        }
        
        if(k != 0){
            while(k>0){
                i++;
                k--;
            }
        }
        
        return i-1;
    }
    
    
    
    /*
          APPROACH -II
          TC:O(n)
          SC:O(1)
          
    */
    public int kthMissing1(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        // If kth missing is beyond the last element
        if(k > arr[n-1] - n){
            return arr[n-1] + (k - (arr[n-1] - n));
        }
        
        for(int i=0; i<n; i++){
            int missing = arr[i] - (i+1);
            if(missing >= k){
                return k+i;
            }
        }
        
        return -1;
    }
    
    
    
    /*
          APPROACH - III ---> Binary Search (Most Optimal)
          TC:O(log n)
          SC:O(1)
          
    */
    public int kthMissing(int[] arr, int k) {
        // code here
        
        int low = 0, high = arr.length-1;
        
        while(low <= high){
            int mid = low+(high - low)/2;
            int missing = arr[mid] - (mid+1);
            
            if(missing < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        
        return low + k;
    }
