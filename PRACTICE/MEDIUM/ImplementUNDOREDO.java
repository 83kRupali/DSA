class Solution {
    
    // ArrayList<Character>arr = new ArrayList<>();
    // Stack<Character> stack= new Stack<>();
    
    // public void append(char x) {
    //     // append x into document
    //     arr.add(x);
    // }

    // public void undo() {
    //     // undo last change
    //     stack.push(arr.get(arr.size()-1));
    //     arr.remove(arr.size()-1);
       
    // }

    // public void redo() {
        
    //     arr.add(stack.pop());
    //     // redo changes
        
    // }

    // public String read() {
        
    //     StringBuilder str = new StringBuilder();
    //     for(int i=0; i<arr.size(); i++){
    //         str.append(arr.get(i));
    //     }
        
    //     return str.toString();
    //     // read the document
    // }
    
    StringBuilder document = new StringBuilder();
    
    Stack<Character>undoStack =  new Stack<>();
    Stack<Character>redoStack = new Stack<>();
    
    public void append(char x){
        document.append(x);
        undoStack.push(x);
        redoStack.clear();   // Imp
    }

    public void undo(){
        if(document.length() == 0) return;
        
        char ch = document.charAt(document.length()-1);
        document.deleteCharAt(document.length()-1);
        redoStack.push(ch);
    }
    
    public void redo(){
        if(redoStack.isEmpty()) return;
        
        char ch = redoStack.pop();
        document.append(ch);
        undoStack.push(ch);
    }
    
    public String read(){
        return document.toString();
    }
     
  
}
