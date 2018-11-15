/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    Node prev = null;
    public Node treeToDoublyList(Node root) {
        if(root == null){
            return root;
        }
        Node fakeHead = new Node(0, null, null);
        prev = fakeHead;
        helper(root);
        prev.right = fakeHead.right;
        fakeHead.right.left = prev;
        return fakeHead.right;
        
    }
    
    public void helper(Node cur){
        if(cur == null){
            return;
        }
        helper(cur.left);
        prev.right = cur;
        cur.left = prev;
        prev = cur;
        helper(cur.right);
    }
}
