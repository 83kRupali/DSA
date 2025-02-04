import java.util.LinkedList;
import java.util.Stack;

public class ValidParentheses {

    // 20
    // TC : O(n)
    // TC : O(n)
    
    public static boolean validParentheses(String str){
        Stack<Character>st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i); 

            if(ch == '(' || ch == '[' || ch =='{'){
                st.push(ch);
            }
            else{
                if(st.size() == 0){
                    return false;
                }

                if((st.peek() == '(' && ch == ')')||
                (st.peek() == '{' && ch == '}')||
                (st.peek() == '[' && ch == ']')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.size() == 0;
    }
    public static void main(String[] args) {
        String str = "[{()";
        System.out.println(validParentheses(str));

        String str1 = "[{()}]";
        System.out.println(validParentheses(str1));

        String str2 = "[{()}]]";
        System.out.println(validParentheses(str2));
    }
}
