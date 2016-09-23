package DecoratorPattern;

import java.io.BufferedReader;
import java.io.IOException;

class UpperCaseReader extends BufferedReader
{

	protected UpperCaseReader(BufferedReader reader) {
		super(reader);
	}
	
	public String readLine()
	{
		String temp=null;
		try {
			temp=super.readLine();	
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(temp==null)
			return null;
		return temp.toUpperCase();
	}
	
}