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
    List<Integer> ans = new ArrayList();        
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return ans;
        if(root.left!=null) ans=inorderTraversal(root.left);
        ans.add(root.val);
        if(root.right!=null) ans=inorderTraversal(root.right);
        return ans;
    }
}
