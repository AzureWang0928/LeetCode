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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = null;
        if (nums == null || nums.length==0) return root;
        if (nums.length==1) return new TreeNode(nums[0]);
        int medium = nums.length/2;
        root = new TreeNode(nums[medium]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, medium));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, medium+1, nums.length));
        return root;
    }
}