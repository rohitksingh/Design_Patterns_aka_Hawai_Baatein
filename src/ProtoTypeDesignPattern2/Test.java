package ProtoTypeDesignPattern2;

public class Test {

	public static void main(String[] args)
	{
		Pizza p1 = new Pizza();
		
		
		PizzaBuilder builder = new PizzaBuilder(p1);
		
		p1 = builder.addCheese()
				    .getPizza();
		
		
		PizzaCloner cloner = new PizzaCloner();
		Pizza clonedPizza = cloner.getCopy(p1);
		
		System.out.println(p1);
		
		builder = new PizzaBuilder(clonedPizza);
		
		builder.addChicken()
		       .addJalepeno()
		       .addPaneer()
		       .getPizza();
		
		System.out.println(clonedPizza);
		
		
	}
	
}
