package FactoryPattern2;

public abstract class FileProcessor {

	public String processFile()
	{
		String file=getFile();
		file=file+" "+addEOFSignal();
		return file;
	}
	
	public String addEOFSignal()
	{
		return "-1";                 //For eg Purpose Judge Not :)
	}
	
	protected abstract String getFile();
	
}
