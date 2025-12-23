public ArrayList<Integer> cntInRange(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer>ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0; i<queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            
            int li = leftIndex(arr, a);
            int ri = rightIndex(arr, b);
            
            ans.add(ri-li);
        }
        
        return ans;
    }
    
    
    public int leftIndex(int arr[], int x){
        int st = 0,  end = arr.length;
        
        while(st < end){
            int mid = st + (end - st)/2;
            
            if(arr[mid]<x){
                st = mid+1; 
            }
            else{
                end = mid;
            }
        }
        return st;
    }
    
    
    public int rightIndex(int arr[], int x){
        int st = 0,  end = arr.length;
        
        while(st < end){
            int mid = st + (end - st)/2;
            
            if(arr[mid] <= x){
                st = mid+1; 
            }
            else{
                end = mid;
            }
        }
        return st;
    }
