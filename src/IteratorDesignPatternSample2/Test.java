package IteratorDesignPatternSample2;

public class Test {

	public static void main(String[] args)
	{
		Cse cse=new Cse();
		Display display=new Display(cse);
		Mech mech=new Mech();
		display=new Display(mech);
	}
}
