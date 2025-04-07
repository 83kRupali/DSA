import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagLevelOrderBT {

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

    //TC: O(n)
    public static ArrayList<ArrayList<Integer>> zigzagLevelOrderBT(Node root){
        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Queue<Node>queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer>arr = new ArrayList<>();

            if(level % 2 == 0){
                for(int i=0; i<size; i++){
                    arr.add(arr.get(i));
                }

                level++;
            }else{
                for(int i=size; i>0; i--){
                    arr.add(arr.get(i));
                }

                level++;
            }
           
            ans.add(arr);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left = new Node(4);

        root.right = new Node(3);

        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.right.left = new Node(7);

        ArrayList<ArrayList<Integer>>ans = zigzagLevelOrderBT(root);

        for(ArrayList<Integer>arr: ans){
            System.out.print(arr);
        }
        System.out.println();
    }
}
