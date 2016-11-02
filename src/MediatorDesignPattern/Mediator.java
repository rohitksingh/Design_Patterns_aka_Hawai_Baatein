package MediatorDesignPattern;

public interface Mediator {

	public void send(String msg,User user);
	
	public void add(User user);
}