package BuilderPattern;

public class Test {
	
	/*
	 
	 Problems without builder pattern 
	 
	1) too many constructors to maintain.

    2) You can partially solve this problem by creating Pizza and then adding
    ingredients but that will impose another problem of leaving Object on
    inconsistent state during building, ideally cake should not be available until its created.
    Both of these problem can be solved by using Builder design pattern in Java. 
    Builder design pattern not only improves readability but also reduces chance of error by adding ingredients 
    explicitly and making object available ONCE FULLY CONSTRUCTED. 
    
	 */

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