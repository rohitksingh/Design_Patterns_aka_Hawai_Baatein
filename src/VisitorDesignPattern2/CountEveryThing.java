package VisitorDesignPattern2;

public class CountEveryThing {

	public void printAllMembers(CSE cse)
	{
		CSEIterator iteator = cse.iterator();
		
		int counter=0;
		
		System.out.println("All registered Students are");
		
		while(iteator.hasNext())
		{
			Student student = (Student)iteator.next();
			System.out.println(++counter+" "+student.getName());
		}
	}
	
}
