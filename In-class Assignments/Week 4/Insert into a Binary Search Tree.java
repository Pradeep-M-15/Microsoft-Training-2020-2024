class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        TreeNode node = root;
        if(val>node.val){
            root.right=insertIntoBST(root.right,val);
        }
        else{
            root.left=insertIntoBST(root.left,val);
        }
        return root;
    }
}
