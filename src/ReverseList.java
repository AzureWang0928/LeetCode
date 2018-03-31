package LinkList;

public class ReverseList {
	 public ListNode reverseList(ListNode head) {
	        if(head != null && head.next !=null){
	            ListNode cur = head;
	            ListNode frontier = null;
	            while(cur.next != null){
	                frontier = cur.next;
	                cur.next = cur.next.next;
	                frontier.next = head;
	                head = frontier;
	            }
	        }
	        return head;
	    }
}
