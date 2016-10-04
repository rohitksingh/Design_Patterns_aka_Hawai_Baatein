package IteratorDesignPatternSample2;


public class Mech {

	private Student[] group;
	int index=0;
	private Iterator iterator;
	
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
	
	/*
	public Student[] getGroup()
	{
	    return 	group;
	}
	*/
	
	public Iterator iterator()
	{
		return iterator=new MechIterator(group);
	}
	
}

