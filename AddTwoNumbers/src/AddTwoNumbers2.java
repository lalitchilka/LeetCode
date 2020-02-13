
public class AddTwoNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(9);
		ListNode l12 = new ListNode(9);
		ListNode l13 = new ListNode(9);
		ListNode l2 = new ListNode(9);
		ListNode l21 = new ListNode(9);
		ListNode l23 = new ListNode(9);
		l1.next = l12;
		l12.next = l13;
		l2.next = l21;
		l21.next = l23;
		
		ListNode result = addTwoNumbers(l1, l2);
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
			int a, b;
			
			if(l1 != null) {
				a  = l1.val;
				l1 = l1.next;
			}else a = 0;
			
			if(l2 != null) {
				b = l2.val;
				l2 = l2.next;
			}else b = 0;
			
			int sum = a + b + carry;
			carry = sum / 10;
			
			result.next = new ListNode(sum % 10);
			result = result.next;
		}
		
		if(carry != 0) result.next = new ListNode(carry);
		return temp.next;
	}

}
