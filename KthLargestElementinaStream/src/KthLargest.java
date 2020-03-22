import java.util.PriorityQueue;

public class KthLargest {
	int k;
    PriorityQueue<Integer> q;
	public KthLargest(int i, int[] arr) {
		// TODO Auto-generated constructor stub
		this.k = i;
		q = new PriorityQueue<>(i);
		for(int num: arr) {
			add(num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int[] arr = new int[]{4,5,8,2};
		KthLargest kthLargest = new KthLargest(k, arr);
		kthLargest.add(3);   // returns 4
		kthLargest.add(5);   // returns 5
		kthLargest.add(10);  // returns 5
		kthLargest.add(9);   // returns 8
		kthLargest.add(4);   // returns 8
		kthLargest.add(9);
	}

	private int add(int i) {
		// TODO Auto-generated method stub
		if(q.size() < k) q.offer(i);
		else if(q.peek() < i){
			q.poll();
			q.offer(i);
		}
		return q.peek();
	}

}
