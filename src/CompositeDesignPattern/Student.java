package CompositeDesignPattern;

public class Student implements Group{

	private String name;

	public Student(String name)
	{
	   setName(name);	
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println(name);
	}
	
}
