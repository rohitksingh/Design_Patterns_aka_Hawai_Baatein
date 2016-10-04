package IteratorDesignPatternSample1;

import java.util.ArrayList;

public class GroupOfSomething {

	ArrayList<Something> group;
	
	public GroupOfSomething()
	{
		group=new ArrayList<Something>();
	}
	
	
	public ArrayList<Something> getGroup()
	{
		return group;
	}
	
	public void add(Something some)
	{
		group.add(some);
	}
	
	
}