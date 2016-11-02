package MediatorDesignPattern;

public class Test {

	public static void main(String[] args)
	{
		
		Mediator mediator = new MobileMediator();
		User rohit = new MobileUser(mediator);
		User singh = new MobileUser(mediator);
		
		mediator.add(rohit);
		mediator.add(singh);
		
		rohit.send("Hello, Can you hear me?", singh);
		
		
	}
	
}
