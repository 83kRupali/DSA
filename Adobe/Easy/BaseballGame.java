public int calPoints(String[] operations) {
        ArrayList<Integer>arr = new ArrayList<>();
        int ans = 0;
        for(String st : operations){
            if(st.equals("+")){
                int n = arr.size();

                int num1 = arr.get(n-1);
                int num2 = arr.get(n-2);

                arr.add(num1+num2);
            }
            else if(st.equals("D")){
                int num = arr.get(arr.size()-1);
                arr.add(num*2);
            }
            else if(st.equals("C")){
                arr.remove(arr.size()-1);
            }
            else{
                arr.add(Integer.parseInt(st));
            }
        }

        for(int i:arr){
            ans += i;
        }
        return ans;
    }
