package VisitorDesignPattern;

public interface Visitor {

	public void visit(Milk milk);
	
	public void visit(Pizza pizza);
	
	public void visit(OtherStuff stuff);
	
}
