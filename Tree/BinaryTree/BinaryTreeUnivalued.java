import java.util.HashSet;

public class BinaryTreeUnivalued {

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

    public static void binaryTreeUnivalued(Node root){
        HashSet<Integer>map = new HashSet<>();
        boolean ans = univalued(root, map);
        System.out.println(ans);
    }

    public static boolean univalued(Node root, HashSet<Integer>map){

        if(root == null){
            return false;
        }
        if(map.contains(root.data)){
            return false;
        }

        boolean left = univalued(root.left, map);
        boolean right = univalued(root.right, map);

        return left || right;


    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);

        root.left.left = new Node(5);
        root.left.right = new Node(2);

        binaryTreeUnivalued(root);
    }
}



