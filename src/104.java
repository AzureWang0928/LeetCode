/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        return Math.max(maxDepthHelp(root.left), maxDepthHelp(root.right));
    }
    private int maxDepthHelp(TreeNode node){
        if (node==null){
            return 1;
        }
        return Math.max(maxDepthHelp(node.left)+1, maxDepthHelp(node.right)+1);

    }
}