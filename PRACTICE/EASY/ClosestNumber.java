static int closestNumber(int n, int m) {
        // code here
        int n1 = n;
        int n2 =  n;
        
        if(n % m == 0) return n;
        
        while(true){
            int num1 = --n1;
            int num2 = ++n2;
            
            if(num2 % m == 0 && num1 % m == 0){
                if(Math.abs(num1)>Math.abs(num2)){
                    return num1;
                }
                else{
                    return num2;
                }
            }
            
            if(num1 % m == 0) return num1;
            
            if(num2 % m == 0) return num2;
            
        }
       // return 0;
    }
    
