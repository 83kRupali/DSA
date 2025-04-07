public class MaxDepthNTree {

    static class Node {
        int data;
        // Node left;
        // Node right;
        Node children;

        Node(int data){
            this.data = data;
            // this.left = null;
            // this.right = null;
            this.children = null;
        }
    }

    public static int maxDepthNTree(Node root){
        if(root == null) return 0;

        int maxDepth = 0;

        for(Node node: root.children){
            if(node != null){
                maxDepth = Math.max(maxDepth, maxDepthNTree(node));
            }
        }

        return (1+maxDepth);
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.children = new Node(3);
    }
}