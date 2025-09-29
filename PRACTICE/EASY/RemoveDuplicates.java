public String removeDuplicates(String s) {
        Stack<Character>stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(!stack.isEmpty() && ch == stack.peek()){
                while(!stack.isEmpty() && ch == stack.peek()){
                    stack.pop();
                }
            }
            else{
                stack.push(ch);
            }
        }

        StringBuilder str = new StringBuilder();

        while(!stack.isEmpty()){
            str.append(stack.pop());
        }

        str.reverse();
        return str.toString();
    }
