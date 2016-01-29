package Bag;

import java.util.Iterator;

import prinstonlib.StdOut;

public class Test_B 
{

	public static void main(String[] args) 
	{
		Bag<Double> b = new Bag<Double>(); 
		StdOut.println("EMPTY? - " + b.isEmpty());
		b.add(4.5);
		b.add(5.5);
		b.add(7.5);
		StdOut.println("SIZE - " + b.size());
		Iterator<Double> i = b.iterator();
		while(i.hasNext())
		{
			StdOut.println(i.next());
		}
		StdOut.println("EMPTY? - " + b.isEmpty());

	}

}
