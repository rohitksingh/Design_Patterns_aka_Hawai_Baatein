package CommandDesignPattern;

public class MacroCommands implements Command{

	Command[] commands;
	
	public  MacroCommands(Command[] commands) {
		this.commands=commands;
	}
	
	@Override
	public void execute() {
		
		for(int i=0;i<commands.length;i++)
			commands[i].execute();
	}

}