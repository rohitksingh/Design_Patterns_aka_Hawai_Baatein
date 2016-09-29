package TemplateDesignPattern;

public class Test {
	
	public static void main(String[] args)
	{
		WriteWithPen pen =new WriteWithPen();
		pen.start();
		
		WriteWithPencil pencil =new WriteWithPencil();
		pencil.start();
	}
}
