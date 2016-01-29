package LinkedQueue;
import java.util.Iterator;

import Exceptions.QueueIsEmptyException;

public class LinkedQueue <Item> implements Iterable<Item>{
	
	private Node first, last;
	private int count=0;
	
	private class Node{
		Item item;
		Node next;
	}
	public int size(){
		return count;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	public void enqueue(Item item)
	{
		if(item!=null){
			Node oldLast = last;
			last = new Node();
			last.item = item;
			last.next = null;
			count++;
			if (isEmpty())
				first = last;
			else
				oldLast.next=last;
		}
	}
	public Item dequeue() throws QueueIsEmptyException{
		if (!isEmpty()){
			Item item = first.item;
			first = first.next;
			count--;
			if (isEmpty()) 
				last = null;
			return item;
		}
		throw new QueueIsEmptyException();
	}
	
	
	@Override
	public Iterator<Item> iterator() {
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Item>{
		private Node current = first;
		@Override
		public boolean hasNext() 
		{
			return current!=null;
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}

		@Override
		public void remove() {
						
		}
	}
}
