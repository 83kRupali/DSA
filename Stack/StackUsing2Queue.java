import java.util.LinkedList;
import java.util.Queue;



public class StackUsing2Queue {
    
        Queue<Integer>q1;
        Queue<Integer>q2;

        StackUsing2Queue(){
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();

        }
        public boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Empty Stack......");
                return -1;
            }

            int top = -1;

            // case 1
            if(!q1.isEmpty()){
                while (!q1.isEmpty()) {
                    top = q1.remove();

                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            else{
                // case 2
                while (!q2.isEmpty()) {
                    top = q2.remove();

                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public int peek(){

            if(isEmpty()){
                System.out.println("Empty Stack......");
                return -1;
            }

            int top = -1;

            // case 1
            if(!q1.isEmpty()){
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            }
            else{
                // case 2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    public static void main(String[] args) {
        
        StackUsing2Queue st = new StackUsing2Queue();

            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);

            while (!st.isEmpty()) {
                System.out.println(st.peek());
                st.pop();
            }
        
        
    }
}
