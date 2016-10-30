package BuilderPattern2;

public class StringAppender {

	String myString;
	
	public StringAppender()
	{
		myString=new String();
	}
	
	public StringAppender(String myString)
	{
		this.myString=myString;
	}
	
	public StringAppender append(String someString)
	{
	    myString = myString+someString;
	    return this;
	}
	
	@Override
	public String toString()
	{
		return myString;
	}
	
}
