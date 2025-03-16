public class DiameterOfTree1 {
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

    static class Info{
        int diam;
        int ht;

        Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
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

    //O(n)

    public static Info diameterOfTree(Node root){
        if(root == null){
            return new Info(0, 0);
        }

        Info leftInfo = diameterOfTree(root.left);
        Info rightInfo = diameterOfTree(root.right);
        
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1 );

        int height = Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(diam, height);
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        System.out.println(diameterOfTree(root).diam);
        System.out.println(diameterOfTree(root).ht);  
    } 
}
