package BuilderPattern2;

public class Test {

	public static void main(String[] args)
	{
		StringAppender appender = new StringAppender();
		appender.append("Rohit")
		        .append(" Singh")
		        .append(" Concat");
		
		System.out.println(appender);
	}
	
}
