/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;
        
        while(fast != null){
            while(fast.next != null && fast.val == fast.next.val){
                fast = fast.next;
            }
            
            if(slow.next != fast){
                slow.next = fast.next;
                fast = slow.next;
            }
            else{
                slow = slow.next;
                fast = fast.next;
            }
            
        }
        return dummy.next;
    }
}
