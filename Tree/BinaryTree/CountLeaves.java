/*
 * 
 * Java: Primitives are passed by value, so changes inside a method do not affect the original variable.

   Java: Only objects are passed by reference (actually, the reference itself is passed by value).

   C++: Supports true pass-by-reference using pointers (*) or references (&), allowing direct modification of primitive variables.

 */


public class CountLeaves {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int countLeaves(Node root) {
        
        int count = 0;
        
        int ans = helper(root, count);
        
        return ans;
         
         // Your code
    }
     
    public static int helper(Node root, int count){
        if(root == null){
            return 0;
        }
         
        if(root.left == null && root.right == null){
            return 1;
        }
         
        return helper(root.left, count) + helper(root.right, count);
         
    }

    public static void main(String[] args) {
         /*
         *              1
         *            /   \
         *           2     3
         *         /  \   /  \
         *        4    5 6    7
         * 
         */
        Node root1 = new Node(1);
        root1.left  = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
      //  root1.right.right = new Node(7);

        System.out.println(countLeaves(root1));


    }
}
