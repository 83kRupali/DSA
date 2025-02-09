import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {

    // TC: O(n)
    // SC: O(n)

    // only one time push and one time pop so that while in constant
    public static void nextGreaterElement(int arr[]){
        Stack<Integer>s = new Stack<>();
        int ans[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = s.peek();
            }

            s.push(arr[i]);
        }


        for(int i=0; i<arr.length; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }

    //496
    public static void nextGreaterElement1(int num1[], int num2[]){

        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer>map = new HashMap<>();

        for(int i=num1.length-1; i>=0; i--){
            while(!s.isEmpty() && s.peek() <= num1[i]){
                s.pop();
            }

            if(s.isEmpty()){
                map.put(num1[i], -1);
            }
            else{
                map.put(num1[i], s.peek());
            }
            s.push(num1[i]);
        }

        int ans[] = new int[num2.length];
        for(int i=0; i<num2.length; i++){
            if(map.containsKey(num2[i])){
                ans[i] = map.get(num2[i]);
            }
        }

        for(int i:ans){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]  = {6,8,0,1,2};
        nextGreaterElement(arr);

        int num[] = {4,1,2};
        int num2[] = {1,3,4,2};

        nextGreaterElement1(num2, num);
    }
}
