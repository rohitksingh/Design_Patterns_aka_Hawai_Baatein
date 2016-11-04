package VisitorDesignPattern2;

import java.util.ArrayList;

public class CSE {

	private ArrayList<Student> list;
	private CSEIterator iterator;
	
	public CSE()
	{
		list = new ArrayList<Student>();
	}
	
	public void addStudent(Student student)
	{
		list.add(student);
	}
	
	public CSEIterator iterator()
	{
		return iterator = new CSEIterator(list);
	}
	
	public void accept(CountEveryThing counter)
	{
		counter.printAllMembers(this);
	}
}