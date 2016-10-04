package IteratorDesignPatternSample1;

import java.util.ArrayList;

	public class GroupOfSomething {

		ArrayList<Something> group;
		private Iterator iterator;
		
		public GroupOfSomething()
		{
			group=new ArrayList<Something>();
		}
		/*
		public ArrayList<Something> getGroup()
		{
			return group;
		}*/
		
		public void add(Something some)
		{
			group.add(some);
		}
		
		public Iterator getIterator()
		{
			iterator=new GroupIterator(group);
			return iterator;
		}
		
	}