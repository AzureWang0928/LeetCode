Solution 1: InOrder Simulation - Bottom Up Approach - leftSubTree -> Node -> rightSubTree

Time Complexity: O(n)
Space Complexity: O(logn) - for recursive call stack

class Solution
{
    ListNode head = null;
    
    public TreeNode sortedListToBST(ListNode head) 
    {
        this.head = head;
        return inorderHelper(0, getLength(head) - 1);
    }
    
    private TreeNode inorderHelper(int start, int end)
    {
        if(start > end)
            return null;
        
        int mid = start + (end - start) / 2;
        
        TreeNode leftChild = inorderHelper(start, mid - 1);
        
        TreeNode root = new TreeNode(head.val); 
		head = head.next;
        
		root.left = leftChild;
        root.right = inorderHelper(mid + 1, end);
        
        return root;
    }
    
    private int getLength(ListNode head)
    {
        int count = 0;
        
        for(ListNode current = head; current != null; current = current.next)
            count++;
        
        return count;
    }
}
Solution 2: PreOrder Simulation - Top Down Approach - Node -> leftSubTree -> rightSubTree

Time Complexity: O(n.logn)
Space Complexity: O(logn) - for recursive call stack

class Solution
{
    public TreeNode sortedListToBST(ListNode head) 
    {
        return sortedListToBSTHelper(head, null);
    }
    
    private TreeNode sortedListToBSTHelper(ListNode head, ListNode tail)
    {
        if(head == tail)
            return null;
        
        ListNode slow = head, fast = head;
        
        while(fast != tail && fast.next != tail)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBSTHelper(head, slow);
        root.right = sortedListToBSTHelper(slow.next, tail);
        return root;
    }
}
Solution 3: Using Array

Time Complexity: O(n)
Space Complexity: O(n) - for array

class Solution 
{
    public TreeNode sortedListToBST(ListNode head)
    {
        int list_size = getLength(head);
        int[] nums = new int[list_size]; 
        int i = 0;
        
        for(ListNode current = head; current != null; current = current.next)
            nums[i++] = current.val;
        
        return sortedArrayToBST(nums, 0, list_size - 1);
    }
    
    private TreeNode sortedArrayToBST(int[] nums, int start, int end)
    {
        if(start > end)
            return null;
        
        int mid = start + (end - start) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);    
        
        return root;
    }
    
    private int getLength(ListNode head)
    {
        int count = 0;
        
        for(ListNode current = head; current != null; current = current.next)
            count++;
        
        return count;
    }
}
