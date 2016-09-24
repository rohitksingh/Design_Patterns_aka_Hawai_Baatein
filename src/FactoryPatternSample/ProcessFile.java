package FactoryPatternSample;

public class ProcessFile {

	Processor processor;
	String name;
	
	ProcessFile(String name)
	{
		this.name=name;
	}
	
	
	public void chooseProcessor()
	{
		
		processor=new ProcessorFactory(name).getProcessor();
		
		/*if(name.equalsIgnoreCase("Low"))
		{
			processor=new LowProcess();
		}	
		else if(name.equalsIgnoreCase("High"))
		{
		    processor=new HighProcess();
		} */   
	}
	
	public void process()
	{
		processor.read();
	}
}


