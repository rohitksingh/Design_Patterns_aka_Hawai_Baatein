package CommandDesignPattern;

public class RemoteTest {

	public static void main(String[] args)
	{
		Light tableLamp=new Light();                                  ///<------------Target Object
		
		
		LightOnCommand lightOn=new LightOnCommand(tableLamp);                 //Create CommandObject   pass target inside Command
 		LightOffCommand lightOff=new LightOffCommand(tableLamp);              //Create CoomandObject
	   
 		
 		Remote remote=new Remote();                                 ///<--------------Invoker                                        
	    remote.setCoomand(lightOn);                                 // Pass Command to invoker
	    remote.buttonPressed();                                     // Invoker invoke method;                           
	    remote.setCoomand(lightOff);    
	    remote.buttonPressed();
	    
	    /*
	     New class is added as per the requirement os client 
	     And we did not make any modification in Remote API 
	     GOOOOOOOD PROGRAMMING PRACTICE 
	     class is not modified but it is extended for new changes.
	     The Whole point of creating command objects.
	     */
	    
        Door frontDoor=new Door();  
	    OpenDoor openDoor=new OpenDoor(frontDoor);
	    remote.setCoomand(openDoor);
	    remote.buttonPressed();
	    CloseDoor closeDoor=new CloseDoor(frontDoor);
	    remote.setCoomand(closeDoor);
	    remote.buttonPressed();
	    
	}
	
}
