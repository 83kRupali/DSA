import java.util.ArrayList;

public class PathRootLeaf {

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

    public static void pathRootLeaf(Node root){
        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        ArrayList<Integer>path = new ArrayList<>();
        getPath(root, ans, path);

        for(ArrayList<Integer>i : ans){
            System.out.println(i);
        }
    }

    public static void getPath(Node root , ArrayList<ArrayList<Integer>>ans, ArrayList<Integer>path ){
        if(root == null){
            return;
        }

        path.add(root.data);

        if(root.left == null && root.right == null){
            ans.add(new ArrayList<>(path));
        
        }
        else{
            getPath(root.left, ans, path);
            getPath(root.right, ans, path);    
        }

        path.remove(path.size()-1);

    }

    public static void pathRootLeaf2(Node root, ArrayList<Integer>path){
        if(root == null){
            return;
        }

        path.add(root.data);

        if(root.left == null && root.right == null){
            printPath(path);
            
        }

        pathRootLeaf2(root.left, path);
        pathRootLeaf2(root.right, path);
        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer>path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
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
        root1.right.right.right = new Node(8);
        root1.right.right.left = new Node(9);

        pathRootLeaf(root1);

        pathRootLeaf2(root1, new ArrayList<>());
    }
}
