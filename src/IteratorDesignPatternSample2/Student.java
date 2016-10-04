package IteratorDesignPatternSample2;

public class Student {

	private String name;
	private String dep;
	
	public Student(String name,String dep)
	{
		this.name=name;
		this.dep=dep;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDepartment()
	{
		return dep;
	}

}