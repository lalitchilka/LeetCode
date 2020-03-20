
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l11 = new ListNode(1);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(4);
		l11.next = l12;
		l12.next = l13;
		
		ListNode l21 = new ListNode(1);
		ListNode l22 = new ListNode(3);
		ListNode l23 = new ListNode(4);
		l21.next = l22;
		l22.next = l23;
		
		ListNode result = mergeTwoLists(l11, l21);
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        
        while(l1 != null && l2 != null) {
        	if(l1.val == l2.val) {
        		result.next = new ListNode(l1.val);
        		result = result.next;
        		result.next = new ListNode(l1.val);
        		l1 = l1.next;
        		l2 = l2.next;
        	}
        	else if(l1.val < l2.val) {
        		result.next = new ListNode(l1.val);
        		l1 = l1.next;
        	}else {
				result.next = new ListNode(l2.val);
				l2 = l2.next;
			}
        	result = result.next;
        }
        if(l1 != null) result.next = l1;
        if(l2 != null) result.next = l2;
		return temp.next;
    }

}
