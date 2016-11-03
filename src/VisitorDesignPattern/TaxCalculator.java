package VisitorDesignPattern;

public class TaxCalculator implements Visitor{

	@Override
	public void visit(Milk milk) {
		System.out.println("Price of milk with tax is "+(milk.getPrice()+11));
		
	}

	@Override
	public void visit(Pizza pizza) {
		System.out.println("Price of pizza with tax is "+(pizza.getPrice()+pizza.getPrice()));
	}

	public void visit(OtherStuff stuff) {
		System.out.println("Price of other Stuff with tax is "+(stuff.getPrice()));
	   //No tax
	}

}