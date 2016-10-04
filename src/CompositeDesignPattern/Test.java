package CompositeDesignPattern;

public class Test {

	public static void main(String[] main)
	{
		CSE CSEB=new CSE("CSE");
		CSEB.add(new Student("Rohit"));
		
		
		CSE malluGang=new CSE("mallu gang");
		malluGang.add(new Student("Some menon"));
		malluGang.add(new Student("Some menon1"));
		
		CSEB.add(malluGang);
		
		Display display=new Display(CSEB);
		display.print();
	}
}