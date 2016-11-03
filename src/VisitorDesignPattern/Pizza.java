package VisitorDesignPattern;

public class Pizza implements Visitable{
	
	private int price;
	
	public Pizza(int price)
	{
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}

	@Override
	public void acceptVisitor(Visitor visitor) {
		
		visitor.visit(this);
	}

}



