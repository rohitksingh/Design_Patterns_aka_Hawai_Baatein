package ProtoTypeDesignPattern2;

public class Pizza implements Cloneable{

	boolean cheese,tomato,jalepeno,paneer,pineapple,chicken;
	
	public boolean addCheese()
	{
		return cheese=true;
	}
	
	public boolean addTomato()
	{
		
		return tomato=true;
		
	}
	
	public boolean addJalepeno()
	{
		return jalepeno=true;
		
	}
	
	public boolean addPanner()
	{
		return paneer=true;
		
	}
	
	public boolean addPineApple()
	{
		return pineapple=true;
	}
	
	public boolean addChicken()
	{
		return chicken = true;
	}
	
	
	public String toString()
	{
		return "\n\nPizza Details\n------------\n\nCheese "+cheese+"\nTomato "+tomato+"\njalepeno "+jalepeno+"\npanner "+paneer+"\nPineApple "+pineapple+"\nChicken "+chicken;
				
	}
	
	public Pizza makeClone()
	{
		Pizza pizza = null;
		try {
			return pizza =(Pizza) this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pizza;
	}
	
}

