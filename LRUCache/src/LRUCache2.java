import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LRUCache2 {
    public static Map<Integer, Node> map;
    int size;
    Node head;
    Node tail;

    public LRUCache2(int capacity) {
        this.size = capacity;
        map = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        int result = -1;
        Node node = map.get(key);
        if(node != null){
            removeNodeFromLinkedList(node);
            addNodeToLinkedList(node);
            result = node.value;
        }
        return result;
    }

    public void put(int key, int value) {
        Node node = map.get(key);

        if(node != null){
            node.value = value;
            removeNodeFromLinkedList(node);
            addNodeToLinkedList(node);
        }
        if(map.size() == size){
            map.remove(tail.prev.key);
            removeNodeFromLinkedList(tail.prev);
        }

        Node newNode = new Node();
        newNode.key = key;
        newNode.value = value;
        addNodeToLinkedList(newNode);
        map.put(key, newNode);
    }

    public void addNodeToLinkedList(Node node){
        Node headNext = head.next;
        head.next = node;
        node.prev = head;

        headNext.prev = node;
        node.next = headNext;
    }

    public void removeNodeFromLinkedList(Node node){
        Node nodePrev = node.prev;
        Node nodeNext = node.next;
        nodePrev.next = nodeNext;
        nodeNext.prev = nodePrev;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(2, 1);
        cache.put(1, 1);
        cache.put(2, 3);
        cache.put(4, 1);
        cache.get(1);
        cache.get(2);
        System.out.println(map);
    }
}

class Node {
    int key;
    int value;
    Node next;
    Node prev;
}
