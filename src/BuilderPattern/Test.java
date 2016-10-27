package BuilderPattern;

public class Test {

	public static void main(String[] args)
	{
		PizzaBuilder builder=new ClassicPizzaBuilder();
		
		Pizza p1=new Pizza("Rohit Singh");
		Pizza p2=new Pizza("Alok Pandey");
		
		builder.provideOrderName(p1.getName());
		
		p1=builder.addCheese()
				  .addMushroom()
				  .getPizza();
		
		builder.provideOrderName(p2.getName());
		
		p2=builder.addCheese()
				  .addMushroom()
				  .addPineApple()
				  .addTomato()
				  .getPizza();
		
		
		getDescription(p1);
		
		System.out.println();
		
		getDescription(p2);
		       
	}
	
	
	public static void getDescription(Pizza pizza)
	{
		System.out.println("Pizza description");
		System.out.println("Pizza Order name : "+pizza.getName());
		System.out.println("Cheese : "+pizza.hasCheese());
		System.out.println("Tomato : "+pizza.hasTomato());
		System.out.println("Mushroom : "+pizza.hasMushroom());
		System.out.println("PineApple : "+pizza.hasPineApple());
	}
	
}