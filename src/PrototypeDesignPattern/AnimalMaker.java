package PrototypeDesignPattern;

public class AnimalMaker{
	
	public Animal getClone(Animal animal)
	{
		return animal.makeCopy();  //<-This makes a clone of Object (Different Hashcodes)
		
		//return animal; <---- this returns same Object  (Same HashCodes)
	}
}
