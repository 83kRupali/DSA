import java.util.LinkedList;
import java.util.Queue;

public class KthLevelOfaTree {

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

    public static class BinaryTree {

        int idx = -1;

        public Node buildTree(int nodus[]){
            idx++;

            if(nodus[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodus[idx]);
            newNode.left = buildTree(nodus);
            newNode.right = buildTree(nodus);

            return newNode;
        }
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    
    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        preOrder(root.left);
        System.out.print(root.data+" ");
        preOrder(root.right);
    }

    public static void levelOrder(Node root){
        if(root == null){
            return;
        }

        Queue<Node>q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.remove();

            if(curr == null){

                System.out.println();

                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data);

                if(curr.left != null){
                    q.add(curr.left);
                }

                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
       
    }

    public static void kthLevelOfaTree(Node root, int level, int K){
        if(level == K){
            System.out.print(root.data+" ");
            return;
        }

        kthLevelOfaTree(root.left, level+1, K);
        kthLevelOfaTree(root.right, level+1, K);
    }
    public static void main(String[] args) {
        int nodes[] = {2,3,-1,-1,4,-1,-1};

        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

        System.out.println(root.data);

        kthLevelOfaTree(root, 1, 2);
        System.out.println();

        Node root1 = new Node(1);
        root1.left  = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);

        kthLevelOfaTree(root1, 1, 3);


    }
}
