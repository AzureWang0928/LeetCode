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
    public boolean isValidBST(TreeNode root) {

        return helper(root, null, null);
    }
    public boolean helper(TreeNode root, Integer max, Integer min){
        if(root == null) return true;
        if((max != null  && root.val >= max) || (min != null && root.val <= min)){
            return false;
        }
        return helper(root.left, root.val, min)  && helper(root.right, max, root.val);
    }
}
