public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(3);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(0);
		ListNode l4 = new ListNode(-4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l2;
		
		System.out.println(hasCycle(l1));
	}
	
	public static boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) return true;
		}
		return false;
	}
}
