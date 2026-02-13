class Solution {

    // optimal
    public int[] twoSum1(int[] n, int target) {
        int i=0, j=n.length-1;

        while(i<=j){
            if(n[i] + n[j] == target){
                return new int[]{i+1,j+1};
            }
            else if(n[i]+n[j]< target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{-1, -1};
    }

    // better
    public int[] twoSum2(int[] n, int target){
        HashMap<Integer, Integer>map = new HashMap<>();

        for(int i=0; i<n.length; i++){
            int val = target-n[i];

            if(map.containsKey(val)){
                return new int[]{map.get(val)+1, i+1};
            }
            else{
                map.put(n[i], i);
            }
        }
        return new int[]{-1, -1};
    }
    
    // Brute
    public int[] twoSum(int[] n, int target){
        for(int i=0; i<n.length; i++){
            for(int j=0; j<n.length; j++){

                if(n[i] + n[j] == target) return new int[]{i+1, j+1};
            }
        }

        return new int[]{-1, -1};
    }
}
