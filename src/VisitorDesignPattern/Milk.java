package VisitorDesignPattern;

public class Milk implements Visitable{

	private int price;
	
	public Milk(int price)
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