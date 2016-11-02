package MediatorDesignPattern;

public class MobileUser extends User{

	public MobileUser(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String msg, User user) {
		
		mediator.send(msg, user);
		
	}

	@Override
	public void receive(String msg) {
		System.out.println("Msg received "+msg);
	}

}
