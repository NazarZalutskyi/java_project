package LinkedStack;
import java.util.Iterator;

import Exceptions.StackIsEmptyException;
import prinstonlib.StdOut;


public class Tester_LS 
{
	public static void main(String[] args) throws StackIsEmptyException 
	{
		LinkedStack<Double> ls = new LinkedStack<Double>(); 
		StdOut.println("EMPTY? - " + ls.isEmpty());
		ls.push(2.5);
		ls.push(3.5);
		ls.push(4.5);
		Iterator<Double> i = ls.iterator();
		while(i.hasNext())
		{
			StdOut.println(i.next());
		}
		StdOut.println("EMPTY? - " + ls.isEmpty());
		StdOut.println("SIZE - " + ls.size());
		 
		StdOut.println("DELETED - " + ls.pop());
		Iterator<Double> i_ = ls.iterator(); 
		while(i_.hasNext())
		{
			StdOut.println(i_.next());
		}
		StdOut.println("SIZE - " + ls.size());
		
		StdOut.println("DELETED - " + ls.pop());
		Iterator<Double> i__ = ls.iterator();
		while(i__.hasNext())
		{
			StdOut.println(i__.next());
		}
		StdOut.println("SIZE - " + ls.size());
		
		 
	}
}
