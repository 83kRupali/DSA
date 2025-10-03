int transitionPoint(int arr[]) {
        // code here
        boolean zero = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zero = true;
            }
            
            if(zero == true && arr[i] == 1){
                return i;
            }
        }
        
        if(zero == false){
            return 0;
        }
        
        return -1;
    }
