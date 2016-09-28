package AdapterPattern;

public class Test {

	public static void main(String[] args)
	{
		CharReaderAPI reader=new CharReaderAPI(new MyCharReader());
		reader.readAllChars("rohit");
      
		ThirdPartyCharReader wooohReader=new ThirdPartyCharReader();//Not Supported
	
		ReaderAdapter adapter=new ReaderAdapter(wooohReader);//Unsupported Object wrapped in Adapter
		
		reader=new CharReaderAPI(adapter);
		
		reader.readAllChars("Singh");
	}
	
}