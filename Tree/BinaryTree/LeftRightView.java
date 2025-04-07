import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftRightView {

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
    //SC: O(m)

    public static ArrayList<Integer> leftView(Node root){
        
        ArrayList<Integer>ans = new ArrayList<>();

        if(root == null)return ans;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        // bfs
        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++) {

                Node node = queue.poll();

                if(i == 0){
                    ans.add(node.data);
                }

                if(node.left != null){
                    queue.offer(node.left);
                }

                if(node.right != null){
                    queue.offer(node.right);
                }
            }
        }

        return ans;
    }

    public static ArrayList<Integer> rightView(Node root){
        
        ArrayList<Integer>ans = new ArrayList<>();

        if(root == null)return ans;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        // bfs
        while(!queue.isEmpty()){
            int size = queue.size();

            while (size > 0){
                Node node = queue.poll();

                if(node.left != null){
                    queue.offer(node.left);
                }

                if(node.right != null){
                    queue.offer(node.right);
                }

                size--;

                if(size == 0){
                    ans.add(node.data);
                }
            }
        }

        return ans;
    }



    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);

        root.left.left = new Node(3);
        root.right.left = new Node(8);
        root.right.right = new Node(4);

        root.left.left.left = new Node(10);

        ArrayList<Integer>ans = rightView(root);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();

        ArrayList<Integer>ans1 = leftView(root);

        for(int i=0; i<ans1.size(); i++){
            System.out.print(ans1.get(i)+" ");
        }
        System.out.println();
    }
}
