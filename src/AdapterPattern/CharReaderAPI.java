package AdapterPattern;

public class CharReaderAPI {

	Reader reader;
	
	public CharReaderAPI(Reader reader)
	{
		this.reader=reader;
	}
	
	public void readAllChars(String name)
	{
		reader.printAllCharacters(name);
	}
	
	
}
