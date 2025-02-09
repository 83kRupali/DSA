import java.util.Stack;

public class LargestLogParanthesis {

    public static int largestLogParanthesis(String s){
        Stack<Integer>stack = new Stack<>();
    
        int ans = 0;
        int num = 0;
        stack.push(-1);
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
    
            if(ch == '('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    ans = Math.max(ans, i-stack.peek());
                }  
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "()()()";
        System.out.println(largestLogParanthesis(s));
    }
}
