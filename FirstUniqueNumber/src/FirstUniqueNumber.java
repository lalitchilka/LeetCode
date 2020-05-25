import java.util.HashMap;
import java.util.Map;

public class FirstUniqueNumber {

    ListNode head;
    ListNode tail;
    Map<Integer, ListNode> map;

    public FirstUniqueNumber(int[] nums) {
        head = new ListNode();
        tail = new ListNode();
        tail.val = -1;
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>();

        for(int num: nums){
            add(num);
        }
    }

    public int showFirstUnique() {
        return head.next.val;
    }

    public void add(int value) {
        ListNode node = new ListNode();
        node.val = value;
        if(map.containsKey(value)){
            if(map.get(value) != null){
                removeFromList(map.get(value));
                map.put(value, null);
            }
        }else{
            addToList(value);
            map.put(value, node);
        }
    }

    public void removeFromList(ListNode node){
        ListNode prevNode = node.prev;
        ListNode nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public void addToList(int value){
        ListNode node = new ListNode();
        node.val = value;

        ListNode prevtail = tail.prev;

        prevtail.next = node;
        node.prev = prevtail;

        node.next = tail;
        tail.prev = node;
    }

    public class ListNode{
        int val;
        ListNode prev;
        ListNode next;
    }
}
