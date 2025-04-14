/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public TreeNode helper(TreeNode root1, TreeNode root2, TreeNode root){

        if (root1 == null && root2 == null)
            return null;

        if(root1 == null && root2 != null)
            root.val = root2.val;
        else if(root1 != null && root2 == null)
            root.val = root1.val;
        else
            root.val = root1.val + root2.val;
        
        TreeNode left1 = root1 != null ? root1.left : null;
        TreeNode left2 = root2 != null ? root2.left : null;
        root.left = helper(left1, left2, new TreeNode());
        
        TreeNode right1 = root1 != null ? root1.right : null;
        TreeNode right2 = root2 != null ? root2.right : null;
        root.right = helper(right1, right2, new TreeNode());

        return root;
        
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        if(root1 == null && root2 == null)
            return null;

        TreeNode root = new TreeNode();

        return helper(root1, root2, root);
        
    }
}