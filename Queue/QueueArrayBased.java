package Queue;

public class QueueArrayBased {
	private int [] queue;
	private final int MAX_SIZE = 50;
	private int size;
	
	public QueueArrayBased() {
		queue = new int[MAX_SIZE];
		size = 0;
	}
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if (size == queue.length) {
			return true;
		}
		return false;
	}
	public boolean enqueue(int new_element) {
		if (!isFull()) {
			queue[size] = new_element;
			size++;
			return true;
		}
	}
	public int peek() {
		return !isEmpty() ? queue[0] : -1;
	}
	public int dequeue() {
		if(!isEmpty()) {
			int temp = queue[0];
			
			for(int i = 1; i < queue.length; i ++) {
				queue[i - 1] = queue[i];
			}
			size--;
			return temp;
		}
		return -1;
	}
		
	
	

}
