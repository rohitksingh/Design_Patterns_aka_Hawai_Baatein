package VisitorDesignPattern;

public class OtherStuff implements Visitable{

	private int price;
	
	public OtherStuff(int price)
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


