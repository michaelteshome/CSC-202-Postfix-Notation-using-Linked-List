
public class LinkedList <T>{

	Node<T> head;
	//T info;
	
	public LinkedList(){
		
	}
	
	public void push(T element) {
		if(head == null) {
			head = new Node<T>(element);
		}
		Node<T> current = new Node<T>(element);
		current.setNext(head);
		head = current;
		System.out.println("Push --> " + current.data);
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Null Pointer");
		}
		else
			System.out.println("\nPop --> " + head.data);
			head =  head.next;
			
		
	}
	

	
	public void printList() {
		Node<T>current;
		current = head;
		System.out.println("List Contains: ");
		System.out.println("\n");
		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
		
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public T getHead() {
		return head.data;
	}
	
}
