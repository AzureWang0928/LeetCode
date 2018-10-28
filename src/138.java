/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null){
            return null;
        } 
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode newHead = new RandomListNode(head.label);
        map.put(head, newHead);
        RandomListNode pre = newHead;
        RandomListNode cur = head.next;

        while(cur != null){
            RandomListNode newNode = new RandomListNode(cur.label);
            pre.next = newNode;
            map.put(cur, newNode);
            cur = cur.next;
            pre = pre.next;        
        }
        
        cur = head;
        RandomListNode newCur = newHead;
        while(cur != null){
            newCur.random = map.get(cur.random);
            cur = cur.next;
            newCur = newCur.next;
        }
        
        return newHead;
    }
}
