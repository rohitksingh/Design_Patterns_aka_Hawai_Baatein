package MediatorDesignPattern;

import java.util.ArrayList;

public class MobileMediator implements Mediator{

	private ArrayList<User> users;
	
	public MobileMediator() {
		
		users=new ArrayList<User>();
	}
	
	
	@Override
	public void send(String msg, User user) {
		
		boolean userNotFound = true;
		System.out.println("Finding user");
		for(User u : users)
		{
			if(u==user)
			{
				System.out.println("User found");
				user.receive(msg);
				userNotFound = false;
			}	
		}
		if(userNotFound)
			System.out.println("UNREGISTERED USER");
		
	}
	

	@Override
	public void add(User user) {
		
		users.add(user);
		
	}
	
}