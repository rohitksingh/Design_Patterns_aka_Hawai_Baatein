package IteratorDesignPatternSample2;

import java.util.ArrayList;

import SingletonPattern2.Student;

public class Cse {

	private ArrayList<Student> list;
	private final String DEP_NAME="CSE";
	
	public Cse()
	{
		list=new ArrayList<Student>();
		add(new Student("Rohit",DEP_NAME));
		add(new Student("Pikachu",DEP_NAME));
	}
	
	public ArrayList getAllStudent()
	{
		return list;
	}
	
	public void add(Student s)
	{
		list.add(s);
	}
}