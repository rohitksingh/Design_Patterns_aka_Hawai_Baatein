package SingletonPatternSample;

public class Test {

	public static void main(String[] args){
		
		/*
		   Create Two objects
		   Set name from both objects 
		   Get name for 1st object 
		   Name is changed
		 */
		
		Settings me=Settings.getInstance();
		
		Settings guest=Settings.getInstance();	
		
		me.setName("Rohit");
		
		System.out.println(me.getName());
		
		guest.setName("asdfghjkllkjhgfdsdfghj");
		
		System.out.println(me.getName());
		
		
	}
}
