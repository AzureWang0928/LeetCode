class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode head = result;
        while(l1!=null || l2!=null || carry!=0){
            int val =((l1==null) ? 0 : l1.val) + ((l2==null) ? 0 : l2.val) + carry;
            head.next = new ListNode(val % 10);
            carry = val>=10?1:0;
            head = head.next;
            
            l1 = l1==null?l1:l1.next;
            l2 = l2==null?l2:l2.next;
        }
        return result.next;
    }
}