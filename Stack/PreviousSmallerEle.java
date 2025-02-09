import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;


public class PreviousSmallerEle {

    //right
    public static void previousSmallerEle(int arr[]){
        Stack<Integer>s = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=arr.length-1; i>=0; i--){
            while (!s.isEmpty() && arr[i]<s.peek()) {
                s.pop();
            }

            if(s.isEmpty()){
                ans.add(-1);
            }
            else{
                ans.add(s.peek());
            }
            s.push(arr[i]);
        }

        Collections.reverse(ans);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
   
    //left
    public static void previousSmallerEle1(int arr[]){
        Stack<Integer>s = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            while (!s.isEmpty() && arr[i]<s.peek()) {
                s.pop();
            }

            if(s.isEmpty()){
                ans.add(-1);
            }
            else{
                ans.add(s.peek());
            }
            s.push(arr[i]);
        }

        //Collections.reverse(ans);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,1,0,8,6};
        previousSmallerEle(arr);
        previousSmallerEle1(arr);
    }
}
