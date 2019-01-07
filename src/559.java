/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        int depth = 0;
        if(root == null){
            return depth;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            depth++;
            for(int i=0; i < size; i++){
                Node cur = queue.poll();
                for(Node child: cur.children){
                    queue.offer(child);
                }
            }
        }
        
        return depth;
    }
}
