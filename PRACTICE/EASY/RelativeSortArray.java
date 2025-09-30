public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        HashMap<Integer, Integer>map = new HashMap<>();

        for(int i=0; i<n1; i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
        }

        ArrayList<Integer>arr = new ArrayList<>();

        for(int i=0; i<n2; i++){
            if(map.containsKey(arr2[i])){
                int count = map.get(arr2[i]);

                for(int j=0; j<count; j++){
                    arr.add(arr2[i]);
                }

                map.remove(arr2[i]);
            }
        }

        ArrayList<Integer>arrr= new ArrayList<>();
        for(Map.Entry<Integer, Integer>entry: map.entrySet()){
            int val = entry.getValue();
            int key = entry.getKey(); 

            for(int i=0; i<val; i++){
                arrr.add(key);
            }
        }

        Collections.sort(arrr);


        int res[] = new int[arr.size()+arrr.size()];
        int i=0;
        for(int val:arr){
            res[i++] = val;
        }

        for(int val:arrr){
            res[i++] = val;
        }
        return res;
    
    }
