package MomenoDesignPattern;

public class SaveState {

	Object savedState;
	
	public void save(SomeIndependentClass sic)
	{
		savedState = sic;
	}
	
	public Object restore()
	{
		return savedState;
	}
	
	
}