import java.util.ArrayList;
import java.util.Stack;

public class StockSpan {

    public static ArrayList<Integer> stockSpan(int arr[], ArrayList<Integer> ans){

        Stack<Integer>s = new Stack<>();

        for(int i=0; i<arr.length; i++){

            while (s.size() > 0 && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if(s.size() == 0){
                ans.add(i+1);
            }
            else{
                ans.add(i-s.peek());
            }
            s.push(i);
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 75, 80};

        ArrayList<Integer> ans = new ArrayList<>();
        stockSpan(arr, ans);

        for(int i:ans){
            System.out.print(i+" ");
        }
        System.out.println();
        
    }
}
