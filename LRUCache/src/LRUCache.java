import java.util.HashMap;
import java.util.Map;

//Not Working
class ListNode{
    int key;
    int value;
    
    ListNode prev;
    ListNode next;
}

class LRUCache {
    
    Map<Integer, ListNode> map = new HashMap<>();
    ListNode head;
    ListNode tail;
    int capacity;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new ListNode();
        tail = new ListNode();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        ListNode node = map.get(key);
        if(node == null) return -1;
        
        moveNodeToHead(node);
        return node.value;
    }
    
    public void moveNodeToHead(ListNode node){
        removeNodeFromList(node);
        addNodeToHead(node);
    }
    
    public void addNodeToHead(ListNode node){
        ListNode headNext = head.next;
        // ListNode headNextPrev = head.next.prev;
        
        // head.next = node;
        // node.prev = head;
        // node.next = headNext;
        // headNext.prev = node;
        
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    
    public void removeNodeFromList(ListNode node){
        ListNode previous = node.prev;
        ListNode nextNode = node.next;
        
        previous.next = nextNode;
        nextNode.prev = previous;
    }
    
    public void put(int key, int value) {
        ListNode node = map.get(key);
        
        if(node == null){
            ListNode newNodeToPut = new ListNode();
            newNodeToPut.key = key;
            newNodeToPut.value = value;
            map.put(key, newNodeToPut);
            addNodeToHead(newNodeToPut);
            
            if(map.size() > capacity){
                removeLRUNode();
            }
        }else{
                node.value = value;
                map.put(key, node);
                addNodeToHead(node);
            }
    }
    
    public void removeLRUNode(){
        map.remove(tail.prev.key);
        ListNode tailPrev = tail.prev.prev;
        tailPrev.next = tail;
        tail.prev = tailPrev;
    }
    
    public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		cache.put(2, 1);
		cache.put(1, 1);
		cache.put(2, 3);
		cache.put(4, 1);
		cache.get(1);
		cache.get(2);
	}
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */