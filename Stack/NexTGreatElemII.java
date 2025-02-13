import java.util.Stack;

public class NexTGreatElemII {

    // Q : 503 
    // TC: O(n)
    // SC: O(n)

    public static void nexTGreatElemII(int arr[]){
        int n = arr.length;
        Stack<Integer> s= new Stack<>();
        int ans[] = new int[n];

        for(int i=2*n-1; i>=0; i--){

            while(!s.isEmpty() && arr[s.peek()] <= arr[i%n]){
                s.pop();
            }

            if(s.isEmpty()){
                ans[i%n] = -1;
            }
            else{
                ans[i%n] = arr[s.peek()];
            }

            s.push(i%n);
        }

        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,6,5,4,2};
        nexTGreatElemII(arr);
    }
}
