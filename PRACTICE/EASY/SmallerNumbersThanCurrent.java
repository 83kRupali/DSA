 public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        int[] copy = java.util.Arrays.copyOf(nums, nums.length);

        Arrays.sort(copy);
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(!map.containsKey(copy[i])){
                map.put(copy[i], i);
            }
        }

        for(int i=0; i<n; i++){
           
            ans[i] = map.get(nums[i]);
        }
        return ans;
    }
