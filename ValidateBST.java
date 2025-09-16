class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inorderTraversal(root, inorder);
        for (int i = 1; i < inorder.size(); i++) {
            if (inorder.get(i) <= inorder.get(i - 1)) return false;
        }
        return true;
    }

    private void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorderTraversal(node.left, list);
        list.add(node.val);
        inorderTraversal(node.right, list);
    }
}
