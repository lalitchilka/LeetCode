
public class AddTwoNumbers3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l11 = new ListNode(2);
		ListNode l12 = new ListNode(4);
		ListNode l13 = new ListNode(3);
		ListNode l21 = new ListNode(5);
		ListNode l22 = new ListNode(6);
		ListNode l23 = new ListNode(4);
		l11.next = l12;
		l12.next = l13;
		l21.next = l22;
		l22.next = l23;
		
		ListNode result = addTwoNumbers(l11, l21);
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}

	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// TODO Auto-generated method stub
		ListNode result = new ListNode(-1);
		ListNode temp = result;
		int carry = 0;
		
		while(l1 != null || l2 != null) {
			int a = 0, b = 0;
			if(l1 != null) {
				a = l1.val;
				l1 = l1.next;
			}
			if(l2 != null) {
				b = l2.val;
				l2 = l2.next;
			}
			
			int sum = a + b + carry;
			carry = sum / 10;
			
			result.next = new ListNode(sum % 10);
			result = result.next;
		}
		if(carry != 0) result.next = new ListNode(carry);
		return temp.next;
	}

}
