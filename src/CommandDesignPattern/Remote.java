package CommandDesignPattern;

public class Remote {

	/*
	 * Old Version of Remote API
	private Command command;;

	public void setCoomand(Command command)
	{
		this.command=command;
				
	}
	
	public void buttonPressed()
	{
		command.execute();
	}
	
	*/
	
	/*
	   Remote API DESIGN UPDATED
	   Now Remote has multiple slots each slot has two buttons on off
	   New code here
	 */
	
	private Command[] onCommand;
	private Command[] offCommand;
	
	public Remote()
	{
		onCommand=new Command[7];
		offCommand=new Command[7];
	}
	
	
	public void setCommand(int slot, Command oncommand, Command offcommand) 
	{
		onCommand[slot] = oncommand;
		offCommand[slot] = offcommand;
	}
	
	
	public void onButtonClicked(int slot)
	{
		onCommand[slot].execute();
	}
	
	public void offButtonClicked(int slot)
	{
		offCommand[slot].execute();
	}
	
}
