import java.util.HashMap;


// TC: O(n)  
// SC:O(n) ---> stack  frame
public class ConstructUniqueBT1 {
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

    public static Node buildTree(int postOrder[], int inOrder[]){

        HashMap<Integer, Integer>indexMap = new HashMap<>();

        // Hash the values with index

        for(int i=0; i<inOrder.length; i++){
            indexMap.put(inOrder[i], i);
        }

        int n = postOrder.length-1;
        int m = inOrder.length-1;

        Node root = constructTree(postOrder, inOrder, indexMap, 0,n, 0, m);
        return  root;
    }

    public static Node constructTree(int preOrder[], int inOrder[], HashMap<Integer, Integer>indexMap, int postSt,int postEnd, int inSt, int inEnd){

        // handle the base case

        if(postSt > postEnd || inSt > inEnd){
            return null;
        }

        int rootData = preOrder[postEnd];
        int rootIndex = indexMap.get(rootData);

        Node root = new Node(rootData);

        int leftSize = rootIndex - inSt;
        int rightSize = inEnd - rootIndex;

        root.left = constructTree(preOrder, inOrder, indexMap, postSt, postSt+leftSize-1, inSt, rootIndex-1);

        root.right = constructTree(preOrder, inOrder, indexMap, postSt+leftSize, postSt+leftSize+rightSize-1, rootIndex+1, inEnd);

        return root;
    }

    public static void postOrder(Node root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        
        int preOrder[] = {3,9,20, 15,7};
        int inOrder[] = {9,3,15,20,7};
        Node root = buildTree(preOrder, inOrder);

        postOrder(root);


    }
}
