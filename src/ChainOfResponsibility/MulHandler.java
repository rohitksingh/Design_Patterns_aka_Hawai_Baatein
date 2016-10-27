package ChainOfResponsibility;


public class MulHandler extends Handler{

	@Override
	public void handle(Numbers request) {
	
		if(request.getFunc().equals(Functions.MULTIPLICATION))
		{
			System.out.println("Multiplication ="+(request.getNum1()*request.getNum2()));
		}
		else
		{
			handler.handle(request);
		}
		
	}

}