class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>set = new HashSet<>();

        int large = Integer.MIN_VALUE;
        for(int i:nums){
            set.add(i);
            large = Math.max(large, i);
        }

        if(large<0) return 1;
        
        for(int i=1; i<large; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return large+1;

    }
}
