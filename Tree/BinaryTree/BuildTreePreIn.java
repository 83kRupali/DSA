    public class BuildTreePreIn {
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
    
        static int preIdx = 0;
        public static int search(int inOrder[], int val, int left, int right){
            for(int i=left; i<=right; i++){
                if(inOrder[i] == val){
                    return i;
                }
            }
    
            return -1;
        }
        public static Node getAns(int preOrder[], int inOrder[], int left, int right){
            if(left > right) return null;
    
            Node root = new Node(preOrder[preIdx]);
    
            preIdx++;
    
            int inIdx = search(inOrder,root.data, left, right);
    
            root.left = getAns(preOrder, inOrder, left, inIdx-1);
            root.right = getAns(preOrder, inOrder, inIdx+1, right);
    
            return root;
        }
    
        public static Node buildTree(int preOrder[], int inOrder[]){
            preIdx = 0;
            return getAns(preOrder, inOrder,0 , preOrder.length-1);
        }
    
        public static void postOrder(Node root){
            if(root == null) return;
    
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static void main(String[] args){
            int preOrder[] = {3,9,20,15,7};
            int inOrder[] ={9,3,15,20,7};
    
            Node root = buildTree(preOrder, inOrder);
            postOrder(root);
            System.out.println();
        }  
    }