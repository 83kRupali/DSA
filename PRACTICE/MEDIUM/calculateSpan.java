class Solution {
    
    /*
        TC: O(n)
        SC: O(n)
    */
    
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<Integer>stack = new Stack<>();
        ArrayList<Integer>res = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
               res.add(i+1); 
            }
            else{
                res.add(i-stack.peek());
                
            }
            
            stack.push(i);
        }
        return res;
    }
 class StockSpanner {
    /*
    TC: O(n)
    SC: O(n)
     */
    Stack<int[]>stack = new Stack<>();
    public StockSpanner() {    
    }
    public int next(int price) {
        int res = 1;
        while(!stack.isEmpty() && stack.peek()[0] <= price){
            res+= stack.pop()[1];
        }
        stack.push(new int[]{price, res});
        return res;
    }   
}
}
