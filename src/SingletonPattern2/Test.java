package SingletonPattern2;


public class Test {

	public static void main(String[] args){

		
		Student rohit=new Student("Rohit", "CSE", "100");
		Student Brook=new Student("Brook", "ECE", "878");		
				
		Register cse=Register.getInstance();
		
		Register ece=Register.getInstance();
		
		cse.addStudent(rohit.getDep(),rohit);
		ece.addStudent(Brook.getDep(), Brook);
		
		cse.displayDatabase();
		
	}
}
