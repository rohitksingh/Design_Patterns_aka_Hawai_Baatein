package VisitorDesignPattern2;

import java.util.ArrayList;

public class CSEIterator {
	
	private ArrayList<Student> list;
	private int counter;
	
	public CSEIterator(ArrayList<Student> list)
	{
		this.list = list;
	}
	
	public Object next()
	{
		return list.get(counter++);
	}
	
	
	public boolean hasNext()
	{
		return counter == list.size();
	}
	

}