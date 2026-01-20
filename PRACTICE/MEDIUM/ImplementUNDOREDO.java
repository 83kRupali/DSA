 ArrayList<Character>arr = new ArrayList<>();
    Stack<Character> stack= new Stack<>();
    
    public void append(char x) {
        // append x into document
        arr.add(x);
    }

    public void undo() {
        // undo last change
        stack.push(arr.get(arr.size()-1));
        arr.remove(arr.size()-1);
       
    }

    public void redo() {
        
        arr.add(stack.pop());
        // redo changes
        
    }

    public String read() {
        
        StringBuilder str = new StringBuilder();
        for(int i=0; i<arr.size(); i++){
            str.append(arr.get(i));
        }
        
        return str.toString();
        // read the document
    }
