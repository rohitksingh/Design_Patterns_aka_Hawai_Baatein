package BuilderPattern;

public class ClassicPizzaBuilder implements PizzaBuilder{

	Pizza pizza;
	
	public void provideOrderName(String orderName)
	{
		pizza=new Pizza(orderName);
	}
	
	
	@Override
	public PizzaBuilder addCheese() {
		
		pizza.setCheese();
		return this;
	}

	@Override
	public PizzaBuilder addTomato() {
		pizza.setTomato();
		return this;
	}

	@Override
	public PizzaBuilder addMushroom() {
		pizza.setMushroom();
		return this;
	}

	@Override
	public PizzaBuilder addPineApple() {
		pizza.setPineApple();
		return this;
	}

	public Pizza getPizza()
	{
		return pizza;
	}
	
}
