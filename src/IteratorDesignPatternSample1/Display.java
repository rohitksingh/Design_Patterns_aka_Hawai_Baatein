package IteratorDesignPatternSample1;

import java.util.ArrayList;

public class Display {

	public void display()
	{
		GroupOfSomething g=new GroupOfSomething();
		g.add(new Something("rohit"));
		g.add(new Something("singh"));
		g.add(new Something("kumar"));
		g.add(new Something("bits"));
		
		//ArrayList<Something> al=g.getGroup();
		/*
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i).getName());
		*/
		
		//Decoupked From Display
		
		Iterator iterator=g.getIterator();
		while(iterator.hasNext())
		{
			Something s=(Something)iterator.next();
			System.out.println(s.getName());
		}
		
	}
}
