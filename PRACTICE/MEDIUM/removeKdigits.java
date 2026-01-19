public String removeKdigits(String num, int k) {
        if(num.length()<k)return "0";

        Stack<Character>stack = new Stack<>();

        for(int i=0; i<num.length(); i++){
            char c = num.charAt(i);

            while(!stack.isEmpty() && k>0 && stack.peek() > c){
                stack.pop();
                k--;
            }

            stack.push(c);
        }

        while(!stack.isEmpty() && k > 0){
            stack.pop();
            k--;
        }

        StringBuilder res = new StringBuilder();

        while(!stack.isEmpty()){
            res.append(stack.pop());
        }

        res.reverse();

        int idx =0;
        while(idx < res.length() && res.charAt(idx) == '0'){
            idx++;
        }

        if(idx == res.length()) return "0";
        String ans = res.substring(idx);

        return ans;

    }
