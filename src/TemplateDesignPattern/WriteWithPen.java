package TemplateDesignPattern;

public class WriteWithPen extends WritingInstrument{

	
	public void openPen()
	{
		System.out.println("Open pen");
	}


	@Override
	public void startInstument() {
		
		openPen();
		
	}
	
	
}