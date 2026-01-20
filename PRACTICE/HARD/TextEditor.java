class TextEditor {

    Stack<Character>left;
    Stack<Character>right; 
    public TextEditor() {
        left = new Stack<>();
        right = new Stack<>();
    }
    
    public void addText(String text) {
        for(int i=0; i<text.length(); i++){
            left.push(text.charAt(i));
        }
    }
    
    public int deleteText(int k) {
        int cnt = 0;

        while(!left.isEmpty() && k>0){
            left.pop();
            cnt++;
            k--;
        }
        return cnt;
    }
    
    public String cursorLeft(int k) {
        while(!left.isEmpty() && k>0){
            char p = left.peek();
            left.pop();
            right.push(p);
            k--;
        }

        return kLeft();
    }

    public String kLeft(){
        int size = left.size();
        int cnt = Math.min(10, size);

        StringBuilder str = new StringBuilder();

        while(cnt>0 && !left.isEmpty()){
            str.append(left.peek());
            left.pop();
            cnt--;
        }

        str.reverse();

        for(int i=0; i<str.length(); i++){
            left.push(str.charAt(i));
        }

        return str.toString();
    }
    
    public String cursorRight(int k) {
        while(!right.empty() && k>0){
            char p = right.peek();
            right.pop();
            left.push(p);
            k--;
        }

        return kLeft();
    }
}
