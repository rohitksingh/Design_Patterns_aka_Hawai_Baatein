package VisitorDesignPattern;

public class Test {

	public static void main(String[] args)
	{
		Milk milk = new Milk(50);
		Pizza mgw = new Pizza(270);
		OtherStuff youKnow = new OtherStuff(100);
		
		Visitor visitor = new TaxCalculator();
		milk.acceptVisitor(visitor);
		mgw.acceptVisitor(visitor);
		youKnow.acceptVisitor(visitor);
	}
}
