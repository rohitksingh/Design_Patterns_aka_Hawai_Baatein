package CommandDesignPattern;

public class CloseDoor implements Command{

	Door door;
	
	public CloseDoor(Door door)
	{
		this.door=door;
	}
	
	@Override
	public void execute() {
	
		door.doorClosed();
	 
	}

}