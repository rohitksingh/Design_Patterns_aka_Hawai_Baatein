package MomenoDesignPattern;

public class Test {

	public static void main(String[] args)
	{
		SaveState state = new SaveState();
		
		SomeIndependentClass sic = new SomeIndependentClass(state);
		sic.run();
		sic.run();
		sic.run();
		
		SomeIndependentClass s1 = (SomeIndependentClass)state.restore();
		System.out.println(s1.getCounterValue());
	}
	
}
