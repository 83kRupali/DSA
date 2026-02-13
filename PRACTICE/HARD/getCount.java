class Solution {
    public int getCount1(int n, int d) {
        // code here
        int res = 0;
        int idx = 1;
        
        for(int i=1; i<=n; i++){
            int sum = digitSum(i);

            
            if(i-sum >= d){
                res++;
            }
        
        }
        return res;
    }
    
    public int digitSum(int i){
        int sum = 0;
        
        while(i>0){
            sum += i%10;
            i /= 10;
        }
        return sum;
    }

    
    public int getCount2(int n, int d){
        int count = 0;
        
        // only check last 200 numbers 
        int start = Math.max(1, n-200);
        
        for(int i=start; i<=n; i++){
            if(i-digitSum(i) >= d){
                count++;
            }
        }
        
        return count;
    }
    
    public int getCount(int n, int d){
        int low = 1;
        int high = n;
        int firstValid = -1;
        
        while(low <= high){
            int mid = low+(high - low)/2;
            
            int val = mid - digitSum(mid);
            
            if(val >= d){
                firstValid = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        if(firstValid == -1) return 0;
        
        return n-firstValid+1;
    }
};
