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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        if(root == null){
            return res;
        }
        Map<Integer, List<Integer>> map = new HashMap();
        Queue<TreeNode> queue = new LinkedList();
        Queue<Integer> col = new LinkedList();
        
        queue.add(root);
        col.add(0);
        
        int min = 0;
        int max = 0;
        
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            int c = col.poll();
            
            List<Integer> list = map.getOrDefault(c, new ArrayList<Integer>());
            list.add(cur.val);
            map.put(c, list);
            
            if(cur.left != null){
                queue.add(cur.left);
                col.add(c - 1);
                min = Math.min(c - 1, min);
            }
            
            if(cur.right != null){
                queue.add(cur.right);
                col.add(c + 1);
                max = Math.max(c + 1, max);
            }
            
        }
        
        for(int i = min; i <= max; i++){
            res.add(map.get(i));
        }
        
        return res;
    }
}
