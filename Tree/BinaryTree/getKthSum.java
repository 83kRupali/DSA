import java.util.ArrayList;

public class getKthSum {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static int ans = 0;
    public static int sumK(Node root, int k) {
        
        ans = 0;
        ArrayList<Integer>arr = new ArrayList<>();
        getAns(root, arr, k);
        
        return ans;
        // code here
    }
    
    public static void getAns(Node root, ArrayList<Integer>arr, int k){
        if(root == null) return;
        
        arr.add(root.data);
        
        int sum = 0;
        for(int i=arr.size()-1; i>=0; i--){
            sum += arr.get(i);
            
            if(sum == k)ans++;
        }
        
        
        getAns(root.left, arr, k);
        getAns(root.right, arr, k);
        
        arr.remove(arr.size()-1);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        
        root.left = new Node(4);
        root.right = new Node(5);

        root.left.left = new Node(3);
        root.left.right = new Node(2);
        root.right.right = new Node(2);

        root.left.right.right = new Node(1);

        /*
         *                8
         *              /  \
         *             4    5
         *           /   \   \
         *          3     2   2
         *                 \
         *                  1   
         */


        System.out.println(sumK(root, 7));  //ans=3
    }
}
