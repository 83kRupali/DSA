import java.util.Stack;

public class PostFixEvalution {

    public static int postFixEvalution(String[] arr) {
        
        Stack<Integer> st = new Stack<>();
        int x1 , x2, r=0;
        
        for(String ch:arr){
            
            if(ch.matches("-?\\d+")){
                st.push(Integer.parseInt(ch));
            }
            else {
                x2 = st.pop();
                x1 = st.pop();
                
                switch(ch){
                    case "+": r = x1+x2; break;
                    case "-": r = x1-x2; break;
                    case "*": r = x1*x2; break;
                    case "/": r = x1/x2; break;
                }
                st.push(r);
            }
        }
        return st.pop();
        // code here
    }
    public static void main(String[] args) {
        String arr[] = {"2", "3", "1", "*", "+", "9", "-"};
        //Output: -4
        // 2 + (3 * 1) – 9 = 5 – 9 = -4.
        String arr1[] = {"100", "200", "+", "2", "/", "5", "*", "7", "+"};
        //Output: 757
        //((100 + 200) / 2) * 5 + 7  = 150 * 5 + 7 = 757.
        System.out.println(postFixEvalution(arr));
        System.out.println(postFixEvalution(arr1));
    }
}