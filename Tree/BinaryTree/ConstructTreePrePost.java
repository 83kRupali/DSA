class ConstructTreePrePost {
    
    int preidx = 0;
    int postidx = 0;
    public Node constructTree(int[] pre, int[] post) {
        // code here
        Node curr = new Node(pre[preidx]);
        preidx++;
        
        if(curr.data != post[postidx]){
            curr.left = constructTree(pre, post);
        }
        
        if(curr.data != post[postidx]){
            curr.right = constructTree(pre, post);
        }
        
        postidx++;
        return curr;
    }
}
