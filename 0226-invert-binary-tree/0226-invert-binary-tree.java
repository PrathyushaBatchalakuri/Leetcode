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
    public TreeNode invertTree(TreeNode root) {

        if( root == null )
            return root;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode current = queue.poll();

            if (current == null)
            continue;

            if(current.left != null || current.right != null){
                TreeNode temp = current.left;
                current.left = current.right;
                current.right = temp;

                queue.offer(current.left);
                queue.offer(current.right);

            }
        }

        return root;
        
    }
}