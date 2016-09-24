package FactoryPatternSample;

public class ProcessTest {

	public static void main(String[] args)
	{
		ProcessFile fileProcess=new ProcessFile("Low");
		fileProcess.chooseProcessor();
		fileProcess.process();
	}
	
}
