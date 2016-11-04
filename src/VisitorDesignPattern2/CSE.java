package VisitorDesignPattern2;

import java.util.ArrayList;

public class CSE {

	private ArrayList<Student> list;
	
	public CSE()
	{
		list = new ArrayList<Student>();
	}
	
	public void addStudent(Student student)
	{
		list.add(student);
	}
	
}
