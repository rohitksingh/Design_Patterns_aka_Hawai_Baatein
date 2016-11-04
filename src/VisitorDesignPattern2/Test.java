package VisitorDesignPattern2;

public class Test {

	public static void main(String[] args)
	{

		CountEveryThing counter = new CountEveryThing();
		
		Student rohit = new Student("ROHIT");
		Student singh = new Student("SINGH");
		Student meaw = new Student("MEAW");
		CSE cseB = new CSE();
		cseB.addStudent(rohit);
		cseB.addStudent(singh);
		cseB.addStudent(meaw);
		cseB.accept(counter);
	}
	
}
