package ArrayStack;

import java.util.Iterator;

import Exceptions.StackIsEmptyException;


import prinstonlib.StdOut;


public class Tester_AS 
{
	
	public static void main(String[] args) throws StackIsEmptyException 
	{
		ArrayStack<Double> as = new ArrayStack<Double>(); 
		StdOut.println("EMPTY? - " + as.isEmpty());
		as.push(3.5);
		as.push(4.5);
		as.push(5.5);
		Iterator<Double> i = as.iterator();
		while(i.hasNext())
		{
			StdOut.println(i.next());
		}
		StdOut.println("EMPTY? - " + as.isEmpty());
		StdOut.println("SIZE - " + as.size());
		
		as.pop();
		Iterator<Double> i_ = as.iterator();
		while(i_.hasNext())
		{
			StdOut.println(i_.next());
		}
		StdOut.println("SIZE - " + as.size());
		
		as.pop();
		Iterator<Double> i__ = as.iterator();
		while(i__.hasNext())
		{
			StdOut.println(i__.next());
		}
		StdOut.println("SIZE - " + as.size());
		 
	}
}
