package CompositeDesignPattern;

public class Display {

	private Group group;
	
	public Display(Group group)
	{
		this.group=group;
	}
	
	public void print()
	{
		group.print();
	}
	
	
}
