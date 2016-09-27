package OldFashionWayWithoutCommandDesign;

public class Remote {

	String command;
	Light light;
	
	public Remote()
	{
	    light=new Light();
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
	}
	
}
