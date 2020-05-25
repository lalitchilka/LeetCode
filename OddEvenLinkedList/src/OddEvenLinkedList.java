public class OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode result = oddEvenList(l1);

        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    private static ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        ListNode even = head.next;
        ListNode h_odd = odd;
        ListNode h_even = even;

        while(even != null){
            if(even.next != null){
                odd.next = even.next;
                odd = odd.next;
            }else{
                odd.next = h_even;
                return h_odd;
            }
            even.next = odd.next;
            even = even.next;
        }
        odd.next = h_even;
        return h_odd;
    }
}
