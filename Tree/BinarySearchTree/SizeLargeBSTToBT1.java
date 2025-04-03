public class SizeLargeBSTToBT1 {

    static class Node {
    
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;
    
        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    
    static int maxBST = 0;
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        maxBST = 0;
        largeBST(root);        
        return maxBST;
    }
    
    static Info largeBST(Node root) {
        if (root == null) 
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
    
        Info leftInfo = largeBST(root.left);
        Info rightInfo = largeBST(root.right);
    
        Info curr= new Info(false, leftInfo.size + rightInfo.size + 1, 0, 0);
    
        // Validate if current subtree is a BST
        if (leftInfo.isBST && rightInfo.isBST && root.data > leftInfo.max && root.data < rightInfo.min) {
            curr.min = Math.min(leftInfo.max, root.data);
            curr.max = Math.max(rightInfo.max, root.data);
            
            curr.isBST = true;
            
            maxBST = Math.max(maxBST, curr.size);
        }
        else{
            curr.isBST = false;
        }
        
        curr.min = Math.min(leftInfo.min, root.data);
        curr.max = Math.max(rightInfo.max, root.data);
        
    
        return curr;
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        
        int info = largestBst(root);
        System.out.println("largest BST Size:"+info);
    }
}
