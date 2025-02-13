import java.util.Stack;

public class LargestRectHistogram {

    // TC:O(n)  SC:O(n) 
    public static int largestRectHistogram(int heigth[]){
        int n = heigth.length;

        int right[] = rightSmaller(heigth, n);
        int left[] = leftSmaller(heigth, n);

        int ans = 0;
        for(int i=0; i<n; i++){
            int width = right[i]-left[i] - 1;
            int currArea = heigth[i]*width;
            ans = Math.max(currArea, ans); 
        }
        return ans;
    }

    public static int[] rightSmaller(int arr[], int n){
        Stack<Integer>s = new Stack<>();

        int right[]= new int[n];

        for(int i=n-1; i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }

            if(s.isEmpty()){
                right[i] = -1;
            }
            else{
                right[i] = s.peek();
            }

            s.push(i);
        }
        return right;
    }


    public static int[] leftSmaller(int arr[], int n){
        Stack<Integer>s = new Stack<>();

        int left[]= new int[n];

        for(int i=0; i<n; i++){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }

            if(s.isEmpty()){
                left[i] = -1;
            }
            else{
                left[i] = s.peek();
            }

            s.push(i);
        }
        return left;
    }

    public static int[] lefttSmaller(int arr[], int n){
        Stack<Integer>s = new Stack<>();

        int left[]= new int[n];

        for(int i=0; i<n; i++){
            while (s.size()>=0 && arr[s.peek()]>=arr[i]) {
                s.pop();
            }

            if(s.isEmpty()){
                left[i] = n;
            }
            else{
                left[i] = s.peek();
            }

            s.push(i);
        }
        return left;
    }
    public static void main(String[] args) {
        int heigth[] = {2,1,5,6,2,3};

        System.out.println(largestRectHistogram(heigth));
    }
}
