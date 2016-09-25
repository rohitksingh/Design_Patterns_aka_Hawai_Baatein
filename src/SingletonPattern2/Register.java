package SingletonPattern2;

import java.util.Set;
import java.util.TreeMap;

public class Register {
	
	private TreeMap<String,Student> database;
	private static Register register;
	
	private Register()
	{
		database=new TreeMap<String,Student>();
	}
	
	public static Register getInstance()
	{
		if(register==null)
			return register=new Register();
		else
			return register;
	}
	
	
	public void addStudent(String dep,Student s)
	{
		database.put(dep,s);
	}
	
	public void displayDatabase(){
		Set<String> keys=database.keySet();
		
		for(String key:keys)
		{
			Student s=database.get(key);
			System.out.println(s.getName()+" "+s.getDep()+" "+s.getRollNum());
		}
	}

}
