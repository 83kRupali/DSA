 public int reverseDigits(int n) {
        // Code here
        int ans = 0;
        
        while(n > 0){
            int num = n%10;
            ans = 10*ans + num;
            n/=10;
        }
        
        return ans;
    }
