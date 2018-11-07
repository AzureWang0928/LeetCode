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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int height = 1;
        BFShelper(root, height, ans);
        return ans;
    }
    
    public void BFShelper(TreeNode root, int height, List<List<Integer>> ans){
        if(root == null){
            return;
        }
        if(height > ans.size()){
            List<Integer> level = new ArrayList<Integer>();
            ans.add(level);
        }
        if(height%2 == 1){
            ans.get(height - 1).add(root.val);
        }
        else{
            ans.get(height - 1).add(0, root.val);
        }
        BFShelper(root.left, height + 1, ans);
        BFShelper(root.right, height + 1, ans);
    }
}
