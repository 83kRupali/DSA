import java.util.LinkedList;
import java.util.Queue;

public class SortedArrayToBST{

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

    public static Node sortedArrayToBST(int arr[], int st, int end){
        if(st>end){
            return null;
        }

        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);

        root.left = sortedArrayToBST(arr, st, mid-1);
        root.right = sortedArrayToBST(arr, mid+1, end);

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
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};

        Node root = sortedArrayToBST(arr, 0, arr.length-1);

        System.out.println(root.data);
        levelOrder(root);
    }
}