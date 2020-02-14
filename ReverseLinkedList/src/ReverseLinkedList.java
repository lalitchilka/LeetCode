
public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(7);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(4);
		ListNode l14 = new ListNode(3);
		
		l1.next = l12;
		l12.next = l13;
		l13.next = l14;
		
		ListNode result = reverseList(l1);
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
	
	private static ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode temp = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return temp;
	}

}
