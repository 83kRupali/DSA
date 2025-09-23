public int ans = 0;

    public void getAns(TreeNode root, int count){
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            ans = Math.max(ans, count+1);
            return;
        }

        //ans = Math.max(ans, count+1);
        //if(root.left != null) 
        getAns(root.left, count+1);
        //if(root.right != null) 
        getAns(root.right, count+1);
    }

    public int maxDepth(TreeNode root) {
        ans = 0;
        getAns(root, 0);
        return ans;
    }
