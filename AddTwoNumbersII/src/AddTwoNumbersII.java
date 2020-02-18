
public class AddTwoNumbersII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(7);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(4);
		ListNode l14 = new ListNode(3);
		ListNode l2 = new ListNode(5);
		ListNode l21 = new ListNode(6);
		ListNode l23 = new ListNode(4);
		l1.next = l12;
		l12.next = l13;
		l13.next = l14;
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
		ListNode rl1 = reverse(l1);
		ListNode rl2 = reverse(l2);
		ListNode result = new ListNode(-1);
		ListNode temp = result;
		int carry = 0;
		
		while(rl1 != null || rl2 != null) {
			int x, y;
			
			if(rl1 != null) {
				x = rl1.val;
				rl1 = rl1.next;
			}else x = 0;
			
			if(rl2 != null) {
				y = rl2.val;
				rl2 = rl2.next;
			}else y = 0;
			
			int sum = x + y + carry;
			carry = sum / 10;
			
			result.next = new ListNode(sum % 10);
			result = result.next;
		}
		if(carry != 0) result.next = new ListNode(carry);
		return reverse(temp.next);
	}

	private static ListNode reverse(ListNode node) {
		// TODO Auto-generated method stub
		if(node == null || node.next == null) return node;
		ListNode temp = reverse(node.next);
		node.next.next = node;
		node.next = null;
		return temp;
	}
	
	

}
