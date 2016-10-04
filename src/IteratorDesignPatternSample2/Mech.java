package IteratorDesignPatternSample2;

import SingletonPattern2.Student;

public class Mech {

	private Student[] group;
	int index=0;
	
	public Mech()
	{
		group=new Student[3];
		add(new Student("mechachu","MECH"));
		add(new Student("arbok","MECH"));
	}
	
	public void add(Student s)
	{
		group[index]=s;
		index++;
	}
	
	public Student[] getGroup()
	{
	    return 	group;
	}
	
}

