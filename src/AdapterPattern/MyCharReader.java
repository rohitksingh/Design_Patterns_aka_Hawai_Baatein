package AdapterPattern;

/*
This is a class which is created by me;
*/
public class MyCharReader implements Reader{
	
	@Override
	public void printAllCharacters(String arr)
	{
		for(int i=0;i<arr.length();i++)
		{
		  System.out.println("char["+i+"]= "+arr.charAt(i));
		}
	}

}
