package PrototypeDesignPattern;

public class Sheep implements Animal{

	public Sheep()
	{
		System.out.println("Sheep Created");
	}
	
	@Override
	public Animal makeCopy() {
		
		System.out.println("Sheep is being created");
		
		Sheep newSheep = null;
		
		try {
			newSheep = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newSheep;
	}

}
