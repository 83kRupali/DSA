import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BSTToBalanceBST {

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

    public static void inOrder(Node root, ArrayList<Integer>arr){
        if(root == null){
            return;
        }

        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);
    }

    //TC: O(n)
    public static Node bSTToBalanceBST(Node root){ 
        if(root == null){
            return null;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        inOrder(root, arr);
        root = balanceBST(arr, 0, arr.size()-1);

        return root;

    }

    public static Node balanceBST(ArrayList<Integer>arr, int st, int end){
        if(st >end){
            return null;
        }

        int mid = (st+end)/2;

        Node root = new Node(arr.get(mid));

        root.left = balanceBST(arr, st, mid-1);
        root.right = balanceBST(arr, mid+1, end);

        return root;
    }

    public static void levelOrder(Node root){
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
                System.out.print(curr.data+" ");

                if(curr.left != null){
                    q.add(curr.left);
                }

                if(curr.right != null){
                    q.add(curr.right);
                }
                
            }
        }
    }

    public static void main(String[] args) {
       
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);


        root = bSTToBalanceBST(root);

        levelOrder(root);


    }
}
