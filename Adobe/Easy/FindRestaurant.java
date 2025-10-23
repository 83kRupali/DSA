
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String>res = new ArrayList<>();

        Map<String, Integer>m = new HashMap<>();
        int minSum = Integer.MAX_VALUE;

        for(int i=0; i<list1.length; i++){
            m.put(list1[i], i);
        }

        for(int i=0; i<list2.length; i++){
            if(m.containsKey(list2[i])){
                int sum = m.get(list2[i]) + i;

                if(sum < minSum){
                    minSum = sum;
                    res.clear();
                    res.add(list2[i]);
                }
                else if(sum == minSum){
                    res.add(list2[i]);
                }
            }
        }
        String ans[] = new String[res.size()];

        for(int i=0; i<ans.length; i++){
            ans[i] = res.get(i);
        }

        return ans;
    }
