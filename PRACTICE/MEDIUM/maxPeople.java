// TC : O(n)
// SC : O(n)

class Solution {
    public int maxPeople(int[] arr) {
        // code here
        int n = arr.length;
        
        int ps[] = new int[n];
        int ns[] = new int[n];
        
        Stack<Integer>stack = new Stack<>();
        
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                stack.pop();
            }
            
            ps[i] = stack.isEmpty() ? -1 :stack.peek();
            
            stack.push(i);
        }
        
        stack.clear();
        
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                stack.pop();
            }
            
            ns[i] = stack.isEmpty() ? n:stack.peek();
            
            stack.push(i);
        }
        
        stack.clear();
        
        int res = 0;
        
        for(int i=0; i<n; i++){
            int left = i-ps[i]-1;
            int right = ns[i]-i-1;

            if(ps[i] != -1) left++;
            if(ns[i] != n) right++;
            
            res = Math.max(res, left+right+1);
        }
        
        return res;
        
    }
}
