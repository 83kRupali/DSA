public void getInOrder(TreeNode root, ArrayList<Integer>arr){
        if(root == null) return;

        getInOrder(root.left, arr);
        arr.add(root.val);
        getInOrder(root.right, arr);
    }

    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return root;

        ArrayList<Integer>arr = new ArrayList<>();

        getInOrder(root, arr);

        TreeNode dummy = new TreeNode(arr.get(0));

        TreeNode curr = dummy;

        for(int i=1; i<arr.size(); i++){
            curr.right = new TreeNode(arr.get(i));
            curr = curr.right;
        }

        return dummy;
    }
