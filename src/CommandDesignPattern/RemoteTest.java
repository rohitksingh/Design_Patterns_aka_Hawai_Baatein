package CommandDesignPattern;

public class RemoteTest {

	public static void main(String[] args)
	{
		Light tableLamp=new Light();                                  ///<------------Target Object
		
		LightOnCommand tableLigthOn=new LightOnCommand(tableLamp);                 //Create CommandObject   pass target inside Command
 		LightOffCommand tableLightOff=new LightOffCommand(tableLamp);              //Create CoomandObject
	   
 		
 		
 		
 		Remote remote=new Remote();                                 ///<--------------Invoker                                        
	    
	    Door frontDoor=new Door();
	    
	    OpenDoor openFrontDoor=new OpenDoor(frontDoor);
	    CloseDoor closeFrontDoor=new CloseDoor(frontDoor);
	    
	    
	    remote.setCommand(0, tableLigthOn, tableLightOff);
	    remote.setCommand(1, openFrontDoor,closeFrontDoor);
	    
	    remote.onButtonClicked(0);
	    remote.onButtonClicked(1);
	    remote.offButtonClicked(0);
	    remote.offButtonClicked(1);
	    
	   
	   
	   
	    
	    
	}
}
