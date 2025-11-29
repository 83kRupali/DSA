class Solution {
    public int findMaxLength(int[] arr) {
        int n = arr.length;
        if(n == 1) return 0;

        HashMap<Integer, Integer>map = new HashMap<>();
        int ans = 0;
        int sum = 0;
        map.put(0, -1);

        for(int i=0; i<n; i++){
            if(arr[i]  == 0) sum -= 1;
            else if(arr[i] == 1) sum += 1;

            if(map.containsKey(sum)){
                int idx = map.get(sum);
                int idx1 = i-idx;

                if(ans < idx1){
                    ans = idx1;
                }
            }
            else{
                map.put(sum, i);
            }
        }
        return ans;
    }
}
