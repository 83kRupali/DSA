 public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        // code here
        // APPROACH - I
        // ArrayList<Integer>ans = new ArrayList<>();
        
        // for(int i=0; i<queries.length; i++){
            
        //     int st = queries[i][0];
        //     int end = queries[i][1];
        //     int x = queries[i][2];
        //     int count = 0;
        //     for(int k=st; k<=end; k++){
        //         if(arr[k] == x){
        //             count++;
        //         }
        //     }
                
        //     ans.add(count++);
        // }
        // return ans;
        
        // APPROACH - II
        //  O(log k) + O(log k) = O(log k)
        // Q = number of queries

        // N = array size (worst case when st = 0 and end = N-1)

        // Total Time = Q × O(log N) = O(Q log N)
        
        ArrayList<Integer>ans = new ArrayList<>();
        
        for(int i=0; i<queries.length; i++){
            
            int st = queries[i][0];
            int end = queries[i][1];
            int x = queries[i][2];
            
            int first = firstOcc(arr, x, st, end);
            
            if(first == -1) ans.add(0);
            else{
                int last = lastOcc(arr, x, st, end);
            
                ans.add(last-first+1);   
            }
        }
        return ans;
    }
    
    public int  firstOcc(int arr[], int x, int st, int end){
        int ans = -1;
        while(st<=end){
            int mid = st + (end-st)/2;
            
            if(arr[mid] == x){
                ans = mid;
                end = mid-1;
            }
            else if(arr[mid] < x){
                st =mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    
    public int  lastOcc(int arr[], int x, int st, int end){
        int ans = -1;
        while(st<=end){
            int mid = st + (end-st)/2;
            
            if(arr[mid] == x){
                ans = mid;
                st = mid+1;
            }
            else if(arr[mid] < x){
                st =mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
