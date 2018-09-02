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
    public TreeNode convertBST(TreeNode root) {
        bst_helper(root, 0);
        return root;
    }
    private int bst_helper(TreeNode cur, int sum){
        if (cur==null) return sum;
        cur.val += bst_helper(cur.right, sum);
        return bst_helper(cur.left, cur.val);
    }
}