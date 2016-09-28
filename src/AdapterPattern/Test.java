package AdapterPattern;

public class Test {

	public static void main(String[] args)
	{
		CharReaderAPI reader=new CharReaderAPI(new MyCharReader());
		reader.readAllChars("rohit");
	}
	
}