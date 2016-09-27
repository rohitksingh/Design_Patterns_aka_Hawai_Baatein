package OldFashionWayWithoutCommandDesign;

public class Remote {

	String command;
	Light light;
	Door door;                          //<---(1) Code is changed here 
	
	public Remote()
	{
	    light=new Light();
	    door=new Door();                //<---(2) Code is changed here
	    
	}
	
	public void setOption(String command)
	{
	   this.command=command;
	}
	
	public void buttonPressed()
	{
		if(command=="LightOn")
		{
			light.off();
		}
		else if(command=="LightOff")
		{
			light.on();
		}
		
		/*
		 Code is changed  from here 
		 */
		else if(command=="DoorOpen")
		{
			door.openDoor();
		}
		else if(command=="DoorClosed")
		{
			door.closeDoor();
		}
		
		/*
		 till Here 
		 All because just a new class is introduced
		 BAD PROGRAMMING PARCTICE 
		 A class should be opened for extension not for modification
		 OPEN-CLOSED PRINCIPLE
		 */
		
	}
	
}
