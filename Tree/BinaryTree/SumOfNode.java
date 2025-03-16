public class SumOfNode {
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

    static class BinaryTree {
    
        static int idx = -1;

        // TC:O(n)
        
        public Node buildTree(int nodes[]){
            idx++;

            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }


    //TC:O(n)
    public static int sumOfNode(Node root){

        if(root == null){
            return 0;
        }

        int leftCount = sumOfNode(root.left);
        int rightCount = sumOfNode(root.right);
       
        int sum = leftCount+rightCount+root.data;
        return sum;
    }


    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        System.out.println(sumOfNode(root));

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);

        System.out.println(sumOfNode(root1));
    }
}
