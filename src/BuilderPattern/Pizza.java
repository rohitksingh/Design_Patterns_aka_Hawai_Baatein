package BuilderPattern;

public class Pizza {
	
	private boolean cheese;
	private boolean tomato;
	private boolean pineApple;
	private boolean mushroom;
	
	private String name;
	
	public Pizza(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public void setCheese() {
		cheese = true;
	}
	
	
	public void setTomato() {
		tomato = true;
	}
	
	
	public void setPineApple() {
		pineApple = true;
	}
	
	
	public void setMushroom() {
		mushroom=true;
	}
	
	
	public boolean hasCheese()
	{
		return cheese;
	}
	
	public boolean hasMushroom()
	{
		return mushroom;
	}
	
	public boolean hasPineApple()
	{
		return pineApple;
	}
	
	public boolean hasTomato()
	{
		return tomato;
	}

}