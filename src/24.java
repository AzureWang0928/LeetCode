i/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode fakehead = new ListNode(0);
        if(head == null || head.next == null){
            return head;
        }
        fakehead.next = head;
        ListNode cur  = fakehead;
        while(cur.next != null && cur.next.next != null){
            ListNode swap1  = cur.next;
            ListNode swap2 = cur.next.next;
            cur.next = swap2;
            swap1.next = swap2.next;
            swap2.next = swap1;
            cur = swap1;
        }
        return fakehead.next;
    }
}
