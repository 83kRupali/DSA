public int sumNumbers(TreeNode root) {
        return getAns(root, new StringBuilder());
    }

    public int getAns(TreeNode root, StringBuilder str){
        if(root == null) return 0;

        str.append(root.val);
        if(root.left == null && root.right == null) return Integer.parseInt(str.toString());

        int left = getAns(root.left, new StringBuilder(str));
        int right = getAns(root.right, new StringBuilder(str));

        return left+right;
    }
