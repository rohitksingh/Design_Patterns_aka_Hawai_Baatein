package IteratorDesignPatternSample2;

public class Display {

	public Display(Group group)
	{
		
		Iterator i=group.iterator();
		
		while(i.hasNext())
			System.out.println(i.next());
		
	}
	
}
