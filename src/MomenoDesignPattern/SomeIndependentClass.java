package MomenoDesignPattern;

public class SomeIndependentClass {

	int counter;
	private SaveState saveState;
	
	public SomeIndependentClass(SaveState saveState)
	{
		this.saveState = saveState;
	}
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			counter++;
			saveState.save(this);
		}
	}
	
	public int getCounterValue()
	{
		return counter;
	}
	
}
