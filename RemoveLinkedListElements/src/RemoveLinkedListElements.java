
public class RemoveLinkedListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(6);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(5);
		ListNode l7 = new ListNode(6);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		
		ListNode head = removeElements(l1, 6);
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	private static ListNode removeElements(ListNode head, int val) {
		if(head == null) return null;
		ListNode result = new ListNode(-1);
		ListNode temp = result;
		/*
		 * while(head != null && head.next!=null && head.val!=val){ if(head.next.val ==
		 * val){ if(head.next.next !=null){ head.next = head.next.next; }else{ head.next
		 * = null; } } head = head.next; }
		 * 
		 * if(result.val == val) return result.next;
		 */
		
		while(head != null) {
			if(head.val != val) {
				result.next = new ListNode(head.val);
				result = result.next;
			}
			head = head.next;
		}
        return temp.next;
	}

}
