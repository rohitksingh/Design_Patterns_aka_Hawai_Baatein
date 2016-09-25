package SingletonPatternSample;

public class Settings {
	
	private static Settings settings;
	private String name;
	
	private Settings()
	{
		
	}
	
	public static Settings getInstance()
	{
		if(settings==null)
			return settings=new Settings();
		else
			return settings;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}

}
