/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        Queue<ListNode> queue = new PriorityQueue(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode l1, ListNode l2){
                return l1.val - l2.val;
            }
        });
        
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        
        for(int i = 0; i < lists.length; i++){
            if(lists[i] != null){
                queue.offer(lists[i]);
            }
        }
        
        while(!queue.isEmpty()){
            ListNode node = queue.poll();
            cur.next = node;
            cur = cur.next;
            if(cur.next != null){
                queue.offer(cur.next);
            }
        }
        return dummy.next;
    }
}
