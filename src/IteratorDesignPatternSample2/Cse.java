package IteratorDesignPatternSample2;

import java.util.ArrayList;

public class Cse implements Group{

	private ArrayList<IteratorDesignPatternSample2.Student> list;
	private final String DEP_NAME="CSE";
	private Iterator iterator;
	
	public Cse()
	{
		list=new ArrayList<Student>();
		add(new Student("Rohit",DEP_NAME));
		add(new Student("Pikachu",DEP_NAME));
	}
	/*
	public ArrayList getAllStudent()
	{
		return list;
	}*/
	
	@Override
	public Iterator iterator()
	{
	   return iterator=new CseIterator(list);
	}
	
	public void add(Student s)
	{
		list.add(s);
	}
}