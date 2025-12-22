 public int rowWithMax1s(int arr[][]) {
        // code here
        
        int ans = -1;
        int countreal = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == 1){
                    int count = arr[i].length-j;
                    
                    if(count > countreal){
                        countreal = count;
                        ans = i;
                    
                    }
                    
                    break;
                }
            }
        }
        return ans;
    }
