package Node;

public class NumberLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList numbers = new LinkedList();
		
		numbers.insert(0,37);
		numbers.insert(0,7);
		numbers.insert(0,4);
		numbers.insert(0,16);
		
		System.out.print(numbers.traversal());
		
		numbers.insert(2,20);
		System.out.print(numbers.traversal());
		
		numbers.insert(25);
		System.out.print(numbers.traversal());
		
		numbers.remove(0);
		System.out.print(numbers.traversal());
		
		numbers.remove(2);
		System.out.print(numbers.traversal());
		
		numbers.removeLastElement();
		System.out.println(numbers.traversal());
		
		

	}

}
