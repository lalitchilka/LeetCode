
public class AddTwoNumbers {

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
		ListNode result = new ListNode(-1);
		ListNode temp = result;
		int carry = 0; 
		while(l1 != null || l2 != null) {
			int x , y ;
			if(l1 != null) x = l1.val;
			else x = 0;
			if(l2 != null) y = l2.val;
			else y = 0;
			
			int sum = carry + x + y;
			carry = sum / 10;
			result.next = new ListNode(sum % 10);
			result = result.next;
			
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
		}
		if(carry != 0) result.next = new ListNode(carry);
		return temp.next;
	}

}
