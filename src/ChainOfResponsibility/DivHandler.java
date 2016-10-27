package ChainOfResponsibility;

public class DivHandler extends Handler {

	@Override
	public void handle(Numbers request) {
	
		if(request.getFunc().equals(Functions.DIVISION))
		{
			System.out.println("Division ="+(request.getNum1()/request.getNum2()));
		}
		else
		{
			handler.handle(request);
		}
		
	}

}