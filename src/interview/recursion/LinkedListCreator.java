package interview.recursion;

import java.util.List;



public class LinkedListCreator {
	/**
	 * Creates a linked list
	 * @param data the data to create the list
	 * @return head of the linked list.
	 * The returned linked list ends with last node with getNext()==null.
	 */
	public Node createLinkedList(List<Integer> data){
		Node firstNode=new Node(data.get(0));
		firstNode.setNext(createLinkedList(data.subList(1,data.size())));
		return firstNode;
	}
	
	public static void main(String[] args){
		
	}
	
	
}
