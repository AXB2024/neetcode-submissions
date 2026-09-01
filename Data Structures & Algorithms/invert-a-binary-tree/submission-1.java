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
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();

            TreeNode temp = currentNode.right;
            currentNode.right = currentNode.left;
            currentNode.left = temp;

            if(currentNode.right != null) {
                queue.add(currentNode.right);
            }

            if(currentNode.left != null) {
                queue.add(currentNode.left);
            }
            
        }
        return root;
    }
}
