package MediatorDesignPattern;

public abstract class User {

	protected Mediator mediator;
	
	public User(Mediator mediator)
	{
		this.mediator = mediator;
	}
	
	public abstract void send(String msg,User user);
	
	public abstract void receive(String msg);
	
}