package IteratorDesignPatternSample2;

public class Display {

	public Display()
	{
		Cse cse=new Cse();
		Mech mech=new Mech();
		
		Iterator i1=new CseIterator(cse.getAllStudent());
		Iterator i2=new MechIterator(mech.getGroup());
		printStudent(i1);
		printStudent(i2);	
	}
	
}
