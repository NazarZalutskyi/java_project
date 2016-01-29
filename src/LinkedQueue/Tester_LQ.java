package LinkedQueue;

import java.util.Iterator;

import prinstonlib.StdOut;
import ArrayQueue.ArrayQueue;
import Exceptions.QueueIsEmptyException;
import Exceptions.StackIsEmptyException;
import LinkedStack.LinkedStack;

public class Tester_LQ 
{
	public static void main(String[] args) throws StackIsEmptyException, QueueIsEmptyException 
	{ 
		LinkedQueue<Double> lq = new LinkedQueue<Double>(); 
		StdOut.println("EMPTY? - " + lq.isEmpty());
		lq.enqueue(3.5);
		lq.enqueue(5.5);
		lq.enqueue(7.5);
		StdOut.println("SIZE - " + lq.size());
		Iterator<Double> i = lq.iterator();
		while(i.hasNext())
		{
			StdOut.println(i.next());
		}
		StdOut.println("EMPTY? - " + lq.isEmpty());
		
		lq.dequeue();
		Iterator<Double> i_ = lq.iterator();
		while(i_.hasNext())
		{
			StdOut.println(i_.next());
		}
		StdOut.println("SIZE - " + lq.size());
		
		lq.dequeue();
		Iterator<Double> i__ = lq.iterator();
		while(i__.hasNext())
		{
			StdOut.println(i__.next());
		}
		StdOut.println("SIZE - " + lq.size());
	}
}
