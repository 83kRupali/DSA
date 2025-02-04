// public class StackUsingLL {

//     Node top; 
//     class Node {
//         int data;
//         Node next;
    
//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     StackUsingLL(){
//         this.top = null;
//     }

//     public boolean isEmpty(){
//         return top == null;
//     }

//     public void push(int val){
//         Node newNode = new Node(val);

//         if(top == null){
//             top = newNode;
//         }
//         newNode.next = top;
//         top = newNode;
//         System.out.println("Push Value:"+top.data);
//     }

//     public int popped(){

//         if(top == null){
//             return -1;
//         }
        
//         int value = top.data;
//         top = top.next;
//         System.out.println("popped value: "+value);
//         return value;
//     }

//     public static void main(String[] args) {
//         StackUsingLL st = new StackUsingLL();
//         st.push(10);
//         st.push(20);
//         st.push(30);
//         st.push(40);
//         st.push(50);
//         st.push(60);
//         st.push(70);
//         st.popped();
//         st.popped();

//         st.popped();
//         st.popped();
//     }
// }
