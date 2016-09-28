package AdapterPattern;

public class ThirdPartyCharReader {

    private char[] charArray;
    
    
	public void takeInput(String input)
	{
		charArray=ChangeToCharArray(input);
	}
	
	public char[] ChangeToCharArray(String input)
	{
		return input.toCharArray();
	}
	
	public void display()
	{
		for(int i=0;i<charArray.length;i++)
		{
			System.out.println("char["+i+"]= "+charArray[i]);
		}
	}
}
