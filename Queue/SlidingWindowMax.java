import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {

    public static ArrayList<Integer> slidingWindowMax(int arr[], int k){
        Deque<Integer> dq = new LinkedList<>();

        ArrayList<Integer>ans = new ArrayList<>();

        // 1st wind        // 1st part
        for(int i=0; i<k; i++){
            while (dq.size() > 0 && arr[dq.getLast()] <= arr[i]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }


        // 2nd part
        for(int i=k; i<arr.length; i++){
            ans.addLast(arr[dq.getFirst()]);

            // remove not part of curr wind

            while (dq.size() > 0 && dq.getFirst() <= i-k) {
                dq.removeFirst();
            }

            // remove the smaller vals

            while (dq.size() > 0 && arr[dq.getLast()] <= arr[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        ans.add(dq.removeFirst());
        return ans;
    }
    public static void main(String[] args) {
        int arr[]  = {1,3,-1,-3, 5,3,6,7};
        int k = 3;

        ArrayList<Integer>ans = slidingWindowMax(arr, k);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
