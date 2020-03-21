
public class LinkedListCycleII {

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
		
		ListNode result = detectCycle(l1);
		System.out.println(result.val);
	}
	
	public static ListNode detectCycle(ListNode head) {
		boolean isCyclic = false;
		ListNode slow = head;
		ListNode fast = head;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				isCyclic = true;
				break;
			}
		}
		if(!isCyclic) return null;
		slow = head;
		while(slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

}
