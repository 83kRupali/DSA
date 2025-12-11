
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        // code here
        
        int n = arr1.size();
        int m = arr2.size();
        
        
        int i=0, j=0;
        
        long sum1 = 0, sum2 = 0, result = 0;
        
        while(i < n && j < m){
            if(arr1.get(i) < arr2.get(j)){
                sum1 += arr1.get(i++);
            }
            else if(arr1.get(i) > arr2.get(j)){
                sum2 += arr2.get(j++);
            }
            else{
                // comman element
                result += Math.max(sum1, sum2)+arr1.get(i);
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        
        while(i<n) sum1 += arr1.get(i++);
        while(j<m) sum2 += arr2.get(j++);
        
        result += Math.max(sum1, sum2);
        
        return (int)result;
    }
