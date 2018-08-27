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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        return dfs_helper(root.left, root.right, sum-root.val);
    }
    
    private boolean dfs_helper(TreeNode left, TreeNode right, int sum){
        if (left==null&&right==null) return sum==0;
        boolean l = false;
        boolean r = false;
        if (left!=null)
            l = dfs_helper(left.left, left.right, sum-left.val);
        if (right!=null)
            r = dfs_helper(right.left, right.right, sum-right.val);
        return l||r;
    }
}