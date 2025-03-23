import java.util.ArrayList;

public class LowestCommonAncestor1 {

    static class  Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    // tC:O(n)
    // SC:O(n^2)

    public static Node lowestCommonAncestor(Node root, int n1, int n2){
        ArrayList<Node>path1 = new ArrayList<>();
        ArrayList<Node>path2 = new ArrayList<>();


        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //last common ancestor

        int i=0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        // last equal node --> i-1th

        Node lca = path1.get(i-1);
        return lca;
    }

    //O(n)
    public static boolean getPath(Node root, int n, ArrayList<Node>path){

        if(root == null){
            return false;
        }

        path.add(root);

        if(root.data == n){
            return true;
        }

        boolean foundleft = getPath(root.left, n, path);
        boolean foundright = getPath(root.right, n, path);

        if(foundleft || foundright){
            return true;
        }

        path.remove(path.size()-1);
        return false;
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
        root1.right.right = new Node(7);

        System.out.println(lowestCommonAncestor(root1, 4,7).data);
        
    }
}
