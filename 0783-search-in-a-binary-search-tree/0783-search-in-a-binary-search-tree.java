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

    public TreeNode sBST(TreeNode root, int val) {
        if(root == null)
            return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while( !queue.isEmpty() ){

            TreeNode current = queue.poll();
            
            if(current.val == val)
                return current;
            
            if(current.left != null)
                queue.offer(current.left);
            
            if(current.right != null)
                queue.offer(current.right);

        }

        return null;
    }
    public TreeNode searchBST(TreeNode root, int val) {

        if( root == null)
            return null;
        
        return sBST(root, val);
        
    }
}