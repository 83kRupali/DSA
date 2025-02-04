// class StackUsingArray{

//     int arr[];
//     int top;
//     int size;

//     StackUsingArray(int size){
//         this.size = size;
//         arr = new int[size];
//         top = -1;
//     }

//     public boolean isEmpty(){
//         return arr.length == -1;
//     }

//     public boolean isFull(){
//         return top == size-1;
//     }

//     //TC:O(1)
//     public void push(int val){
//         if(isFull()){
//             return;
//         }

//         arr[++top] = val;
//         System.out.println("Push Value: "+val);
//     }

//     //O(1)
//     public int popped(){
//         if(isEmpty()){
//             return -1;
//         }

//         int val = arr[top--];
//         ;
//         System.out.println("popped value: " +val);
//         return val;
//     }
//     public static void main(String args[]){
//         StackUsingArray st = new StackUsingArray(5);
//         st.push(10);
//         st.popped();
//         st.push(10);
//         st.push(20);
//         st.push(30);
//         st.push(40);
//         st.push(50);

//         for(int i=0; i<st.size; i++){
//             System.out.print(st.arr[i]+" ");
//         }
//         System.out.println();

//         for(int i=st.size-1; i>=0; i--){
//             System.out.print(st.arr[i]+" ");
//         }
//         System.out.println();

//         st.popped();
//         st.popped();
//         st.popped();
//         st.popped();
//         st.popped();
       

//     }
// }

import java.util.ArrayList;

public class StackUsingArray {

    ArrayList<Integer>arr;

    public void push(int val){
        arr.addLast(val);
    }

    public int pop(){
       return arr.remove(arr.size()-1);
    }

    int top(){
        return arr.get(arr.size()-1);
    }

    public boolean isEmpty(){
        return arr.size() == 0;
    }
    public static void main(String[] args) {
        StackUsingArray st = new StackUsingArray();
        st.push(10);
        st.push(20);

        st.push(10);
        st.push(20);

        while(!st.isEmpty()){
            System.out.print(st.top());
            st.pop();
        }
        System.out.println();
    }

}