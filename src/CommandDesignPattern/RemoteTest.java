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
	    
	    
	}
	
}
