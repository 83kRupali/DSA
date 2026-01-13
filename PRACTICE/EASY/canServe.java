 public boolean canServe(int[] arr) {
        // code here
        int n = arr.length;
    
        if(arr[0] != 5) return false;    
        
        int five = 0;
        int ten = 0;
        
        for(int i:arr){
            if(i == 5){
                five++;
            } 
            else if(i == 10){
                if(five == 0) return false;
                five--;
                ten++;
            }
            else if(i == 20){
                if(five == 0 && ten == 0) return false;
                
                if(five != 0 && ten != 0){
                    five--;
                    ten--;
                }
                else if(five >= 3){
                    five -= 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
