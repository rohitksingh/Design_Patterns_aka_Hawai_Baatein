package AdapterPattern;

public class ReaderAdapter implements Reader{

	private ThirdPartyCharReader thirdPartyReader;
	
	public ReaderAdapter(ThirdPartyCharReader thirdPartyReader) {
		
		this.thirdPartyReader=thirdPartyReader;
	}
	
	
	@Override
	public void printAllCharacters(String arr) {
		
		thirdPartyReader.takeInput(arr);
		thirdPartyReader.ChangeToCharArray(arr);
		thirdPartyReader.display();
	}

}
