package CommandDesignPattern;

public class Remote {

	
	private Command command;;
	
	
	public void setCoomand(Command command)
	{
		this.command=command;
				
	}
	
	public void buttonPressed()
	{
		command.execute();
	}
	
}
