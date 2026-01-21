class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int prevs[] = new int[n];
        int nexts[] = new int[n];

        previousLess(arr, prevs);
        nextLess(arr, nexts);

        long MOD = 1_000_000_007;
        long total = 0;
        
        for(int i=0; i<n; i++){
            long left = i - prevs[i];
            long right = nexts[i]-i;

            total = (total + arr[i] * left * right) % MOD;
        }
        return (int)total;
    }

    public void previousLess(int arr[], int prevs[]){
        Stack<Integer>stack = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                prevs[i] = -1;
            }
            else{
                prevs[i] = stack.peek();
            }

            stack.push(i);
        }

    }
    public void nextLess(int arr[], int next[]){
        Stack<Integer>stack = new Stack<>();
        int n=arr.length;

        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                next[i] = n;
            }
            else{
                next[i] = stack.peek();
            }

            stack.push(i);
        }
    }


}
