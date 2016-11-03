package ProtoTypeDesignPattern2;

public class PizzaBuilder {

	Pizza pizza;
	
	public PizzaBuilder(Pizza pizza)
	{
		this.pizza = pizza;
	}
	
	public PizzaBuilder addCheese()
	{
		pizza.addCheese();
		return this;		
	}
	
	public PizzaBuilder addTomato()
	{
		pizza.addTomato();
		return this;
	}
	
	public PizzaBuilder addJalepeno()
	{
		pizza.addJalepeno();
		return this;
	}
	
	public PizzaBuilder addPaneer()
	{
		pizza.addPanner();
		return this;
	}
	public PizzaBuilder addPineApple()
	{
		pizza.addPineApple();;
		return this;
	}
	public PizzaBuilder addChicken()
	{
		pizza.addChicken();
		return this;
	}
	
	
	public Pizza getPizza()
	{
		return pizza;
	}
	
}