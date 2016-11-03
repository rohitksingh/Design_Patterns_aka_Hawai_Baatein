package PrototypeDesignPattern;

public class Test {

	public static void main(String[] args)
	{
		AnimalMaker maker = new AnimalMaker();
		
		Sheep sally = new Sheep();
		
		Sheep clonedSheep = (Sheep)maker.getClone(sally);
		
		System.out.println("HashCode of Original Sheep "+sally.hashCode());
		
		System.out.println("HashCode of cloned Sheep "+clonedSheep.hashCode());
		
	}
	
}
