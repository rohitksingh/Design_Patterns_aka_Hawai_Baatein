package FactoryPattern2;

public class Test {

	public static void main(String[] args)
	{
		System.out.println("Multiple options");
		System.out.println("Selects camera");
		FileProcessor fileProcessor=new CapturePhoto();
		System.out.println(fileProcessor.processFile());
		System.out.println("Now voice Recorder");
		
		fileProcessor=new RecordVoice();
		System.out.println(fileProcessor.processFile());
	}
	
}
