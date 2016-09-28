package CommandDesignPattern;

public class Nocommand implements Command{

	@Override
	public void execute() {
		System.out.println("Do nothing");
	}

}
