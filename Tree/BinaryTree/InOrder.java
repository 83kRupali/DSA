// import java.util.LinkedList;
// import java.util.Queue;

public class InOrder {
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
    public static void inOrder(Node root){

        if(root == null){
            System.out.print("-1"+" ");
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    // public static void levelOrder(Node root){
    //     Queue<Node>q = new LinkedList<>();

    //     if(root == null){
    //         return;
    //     }

    //     q.add(root);
    //     q.add(null);

    //     while (!q.isEmpty()) {
    //         Node curr = q.remove();

    //         if(curr == null){
    //             System.out.println();
    //             if(q.isEmpty()){
    //                 break;
    //             }
    //             else{
    //                 q.add(null);
    //             }
    //         }
    //         else{

    //             System.out.print(curr.data+" ");

    //             if(curr.left != null){
    //                 q.add(curr.left);
    //             }

    //             if(curr.right != null){
    //                 q.add(curr.right);
    //             }
    //         }
    //     }
    // }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        inOrder(root);
        System.out.println();

    }
}
