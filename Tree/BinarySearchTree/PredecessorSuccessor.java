public class PredecessorSuccessor {

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

    public static void predecessorSuccessor(Node root, Node pre[], Node suc[], int key){

        while (root != null) {
            if(key < root.data){
                suc[0] = root;
                root = root.left;
            }

            else if(key > root.data){
                pre[0] = root;
                root = root.right;
            }

            else{
                if(root.left != null){
                    Node temp = root.left;

                    while (temp.right != null) {
                        temp = temp.right;
                    }

                    pre[0] = temp;
                }

                if(root.right != null){
                    Node temp = root.right;

                    while (temp.left != null) {
                        temp = temp.left;
                    }

                    suc[0] = temp;
                }

                break;
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(1);
        root.right = new Node(9);

        root.left.right = new Node(4);
        root.right.right = new Node(10);

        root.left.right.left = new Node(3);

        Node suc[] = new Node[10];
        Node pre[] = new Node[10];
        
        predecessorSuccessor(root, pre, suc, 4);

        System.out.println(suc[0].data);
        System.out.println(pre[0].data);
    }
}
