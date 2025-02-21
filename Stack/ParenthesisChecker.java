import java.util.Stack;

public class ParenthesisChecker {

    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length() % 2 != 0){
            return false;
        }
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(!st.isEmpty() && (st.peek() == '[' && ch == ']')){
                st.pop();
            }
            
            else if(!st.isEmpty() && (st.peek() == '(' && ch == ')')){
                st.pop();
            }
            else if(!st.isEmpty() && (st.peek() == '{' && ch == '}')){
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
        
        if(!st.isEmpty()){
            return false;
        }
    
        return true;
        // code here
    }
    public static void main(String[] args) {
        String s = "{[()]";
        String s1 = "}[([])]";
        String s2 = "{[]}{}()[]";
        System.out.println(isBalanced(s));
        System.out.println(isBalanced(s1));
        System.out.println(isBalanced(s2));
    }
}
