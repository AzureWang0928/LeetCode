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
    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        if (Math.abs(isBalancedHelp(root.left)-isBalancedHelp(root.right))>1) return false;
        else return isBalanced(root.left)&&isBalanced(root.right);
    }
    private int isBalancedHelp(TreeNode root){
        if (root==null) return 0;
        return Math.max(isBalancedHelp(root.left), isBalancedHelp(root.right))+1;
    }
}