public boolean ans = false;

    public void getAns(TreeNode root, int targetSum){
        if(root == null){
            if(targetSum == 0){
                ans = true;
                return;
            }
        }

        if(root.left == null && root.right == null){
            if(targetSum == 0){
                ans = true;
                return;
            }
        }

        if(root.left != null)getAns(root.left, targetSum-root.val);
        if(root.right != null) getAns(root.right,targetSum-root.val);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        // if(root == null) return false;
        // ans = false;
        // getAns(root, targetSum);
        // return ans;

        if(root == null) return false;

        if(root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum-root.val);
    }
