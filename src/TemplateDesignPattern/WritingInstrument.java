package TemplateDesignPattern;

public abstract class WritingInstrument {
	
	public void start()
	{
		takePaper();
		startInstument();
		write();
	}
	
	public void takePaper()
	{
		System.out.println("Take paper");
	}
	
	public void write()
	{
		System.out.println("Write");
	}
	
	public abstract void startInstument();
}

