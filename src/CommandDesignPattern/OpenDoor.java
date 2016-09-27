package CommandDesignPattern;

public class OpenDoor implements Command{

	Door door;
	
    public OpenDoor(Door door) {
		this.door=door;
	}
	
	@Override
	public void execute() {
		door.openDoor();
	}

}
