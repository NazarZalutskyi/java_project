package ArrayQueue;


import java.util.Iterator;

import Exceptions.QueueIsEmptyException;

public class ArrayQueue<Item> {
	
	private Item[] queue;
	private int head = 0;
	private int tail = 0;
	
	public ArrayQueue(){
		queue = (Item[]) new Object[4];
	}
	
	public void enqueue(Item item){
		if(item!=null){
			queue[tail] = item;
			tail++;
			if (queue.length<=tail) {
				if (queue.length<(tail-head)*2) resize(tail*2);
				else resize (tail);
			}
		}
	}
	public Item dequeue() throws QueueIsEmptyException{
		if (!isEmpty()){
			if (queue.length>(tail-head)*4) resize((head-tail)*2);
			return queue[head++];
		}
		throw new QueueIsEmptyException();
	}
	
	public int size(){
		return tail-head;
	}
	
	public boolean isEmpty() {
		return tail == 0;
	}

	private void resize(int n) {
		Item [] change = (Item[])new Object[n];
		for (int i=0; i<tail-head; i++){
			change[i]=queue[head+i];
		}
		queue = change;
		tail=tail-head+1;
		head=0;
	}
	
	public Iterator<Item> iterator() {
		return new ReverseArrayIterator();
	}
	
	private class ReverseArrayIterator implements Iterator<Item>{

		private int i=head;
		@Override
		public boolean hasNext() {
			return i<tail;
		}

		@Override
		public Item next() {
			return queue[i++];
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
		
	}

}
