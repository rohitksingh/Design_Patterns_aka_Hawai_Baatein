package ChainOfResponsibility;

public class Test {

	public static void main(String[] args)
	{
		Numbers num = new Numbers(6,4,Functions.MULTIPLICATION);
		
		Handler addHandler=new AddHandler();
		Handler subHandler=new SubHandler();
		Handler mulHandler=new MulHandler();
		Handler divHandler=new DivHandler();
		Handler fallOffHandler = new FallOffHandler();
		
		addHandler.next(subHandler);
		subHandler.next(mulHandler);
		mulHandler.next(divHandler);
		divHandler.next(fallOffHandler);
		
		addHandler.handle(num);
		
		
	}
}
