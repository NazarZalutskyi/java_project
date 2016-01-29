package ArrayQueue;

import java.util.Iterator;

import prinstonlib.StdOut;
import ArrayStack.ArrayStack;
import Exceptions.QueueIsEmptyException;
import Exceptions.StackIsEmptyException;

public class Tester_AQ 
{
	public static void main(String[] args) throws StackIsEmptyException, QueueIsEmptyException 
	{
		ArrayQueue<Double> aq = new ArrayQueue<Double>(); 
		StdOut.println("EMPTY? - " + aq.isEmpty());
		aq.enqueue(3.5);
		aq.enqueue(4.5);
		aq.enqueue(5.5);
		StdOut.println("SIZE - " + aq.size());
		Iterator<Double> i = aq.iterator();
		while(i.hasNext())
		{
			StdOut.println(i.next());
		}
		StdOut.println("EMPTY? - " + aq.isEmpty());
		
		aq.dequeue();
		Iterator<Double> i_ = aq.iterator();
		while(i_.hasNext())
		{
			StdOut.println(i_.next());
		}
		StdOut.println("SIZE - " + aq.size());
		
		aq.dequeue();
		Iterator<Double> i__ = aq.iterator();
		while(i__.hasNext())
		{
			StdOut.println(i__.next());
		}
		StdOut.println("SIZE - " + aq.size());
	}
}
