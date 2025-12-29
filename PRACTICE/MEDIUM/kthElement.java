
    /*
        TC: O(n+m)log(n+m)
        SC: O(n+m)
    */
    public int kthElement2(int a[], int b[], int k) {
        // code here
        int arr[] = new int[a.length+b.length];
        
        int temp = 0;
        
        for(int i=0; i<a.length; i++){
            arr[temp++] = a[i];
        }
        
        for(int i=0; i<b.length; i++){
            arr[temp++] = b[i];
        }
        
        Arrays.sort(arr);
        return arr[k-1];
    }
    
    /*
        TC: O(n+m)
        SC: O(1)
    */
    public int kthElement1(int a[], int b[], int k) {
        int i=0, j=0, count = 0;
        
        while(i<a.length && j<b.length){
            count++;
            
            if(a[i] <= b[j]){
                
                if(count == k) return a[i];
                i++;
            }
            else{
                if(count == k) return b[j];
                j++;
            }
        }
        
        while(i<a.length){
            count++;
            if(count == k) return a[i];
            i++;
        }
        
        while(j<b.length){
            count++;
            if(count == k) return b[j];
            j++;
        }
        return -1;
    }
    
    /*
        TC: O(log(min(n, m)))
        SC: O(1)
    */
    public int kthElement(int a[], int b[], int k) {
        if(a.length > b.length) return kthElement(b, a, k);
        
        int n = a.length, m = b.length;
        int low = Math.max(0, k-m);
        int high = Math.min(k, n);
        
        while(low <= high){
            int cut1 = (low+high) / 2;
            int cut2 = k - cut1;
            
            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : a[cut1 - 1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : b[cut2 - 1];
            int right1 = (cut1 == n) ? Integer.MAX_VALUE : a[cut1];
            int right2 = (cut2 == m) ? Integer.MAX_VALUE : b[cut2];
            
            if(left1 <= right2 && left2 <= right1){
                return Math.max(left1, left2);
            }
            else if(left1 > right2){
                high = cut1 - 1;
            }
            else{
                low = cut1 + 1;
            }
        }
        
        return -1;
    }
