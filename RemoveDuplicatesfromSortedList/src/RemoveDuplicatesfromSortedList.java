
public class RemoveDuplicatesfromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(2);
		ListNode l5 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		
		ListNode result = deleteDuplicates(l1);
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
	
	private static ListNode deleteDuplicates(ListNode head) {
		ListNode result = new ListNode(-1);
		ListNode temp = result;
		
		while(head != null && head.next != null) {
			if(head.val != head.next.val) {
				result.next = new ListNode(head.val);
				result = result.next;
			}
			head = head.next;
		}
		if(head != null) result.next = head;
		return temp.next;
	}

}
