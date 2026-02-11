// TC: O(n)+O(n)+O(n) == O(n)
    // SC: left - O(n), right - O(n), res - O(n)  === O(n)
    public int[] getSmaller1(int[] arr) {
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int res[] = new int[n];
        
        Arrays.fill(left, -1);
        Arrays.fill(right, -1);
        
        Stack<Integer>stack = new Stack<>();
        
        //Nearest Smaller to left
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            
            if(!stack.isEmpty()) left[i] = stack.peek();
            
            stack.push(i);
        }
        
        stack.clear();
        
        // Nearest Smaller to Right
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            
            if(!stack.isEmpty()) right[i] = stack.peek();
            stack.push(i);
        }
        
        // final comparision
        
        for(int i=0; i<n; i++){
            int l = left[i];
            int r = right[i];
            
            if(l == -1 && r == -1){
                res[i] = -1;
            }
            else if(l == -1){
                res[i] = r;
            }
            else if(r == -1){
                res[i] = l;
            }
            else{
                int distL = i-l;
                int distR = r-i;
                
                if(distL < distR){
                    res[i] = l;
                }
                else if(distR < distL){
                    res[i] = r;
                }
                else{
                    // same distance
                    
                    if(arr[l] < arr[r]){
                        res[i] = l;
                    }
                    else if(arr[r] < arr[l]){
                        res[i] = r;
                    }
                    else{
                        res[i] = Math.min(l, r);
                    }
                }
            }
        }
        return res;
    }
    
    
    public int[] getSmaller(int[] arr){
        int n = arr.length;
        int []res = new int[n];
        
        for(int i=0; i<n; i++){
            int leftIdx = -1;
            int rightIdx = -1;
            
            // search left
            
            for(int l = i-1; l>=0; l--){
                if(arr[l] < arr[i]){
                    leftIdx = l;
                    break;
                }
            }
            
            // search right 
            for(int r=i+1; r<n; r++){
                if(arr[r] < arr[i]){
                    rightIdx = r;
                    break;
                }
            }
            
            // Decision 
            if(leftIdx == -1 && rightIdx == -1){
                res[i] = -1;
            }
            else if(leftIdx == -1){
                res[i] = rightIdx;
            }
            else if(rightIdx == -1){
                res[i] = leftIdx;
            }
            else{
                int distL = i-leftIdx;
                int distR = rightIdx-i;
                
                if(distL < distR){
                    res[i] = leftIdx;
                }
                else if(distR < distL){
                    res[i] = rightIdx;
                }
                else{
                    
                    // same Distance
                    if(arr[leftIdx] < arr[rightIdx]){
                        res[i] = leftIdx;
                    }
                    else if(arr[rightIdx] < arr[leftIdx]){
                        res[i] = rightIdx;
                    }
                    else{
                        res[i] = Math.min(leftIdx, rightIdx);
                    }
                }
            }
        }
        
        return res;
    }
