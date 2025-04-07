import java.util.LinkedList;
import java.util.Queue;


public class CousinsBT {

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

    // same lavel but diffrent parent

    public static boolean cousinsBT(Node root, int x, int y){
        if(root == null) return false;

        Queue<Node>queue = new LinkedList<>();
        queue.offer(root);

        int childCount = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            // check at same level

            for(int i=0; i<size; i++){
                Node node = queue.poll();

                int sameParentCount = 0;
                
                if(node.left != null){
                    if(node.left.data == x || node.left.data == y){
                        sameParentCount++;
                        childCount++;
                    }
    
                    queue.offer(node.left);
                }

                if(node.right != null){
                    if(node.right.data == x || node.right.data == y){
                        sameParentCount++;
                        childCount++;
                    }
    
                    queue.offer(node.right);
                }

                if(sameParentCount == 2) return false;
            }

            if(childCount == 2){
                return true;
            }

            if(childCount == 1){
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
    }
}
