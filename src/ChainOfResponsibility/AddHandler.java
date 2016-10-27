package ChainOfResponsibility;

public class AddHandler extends Handler{

	@Override
	public void handle(Numbers request) {
		
		if(request.getFunc().equals(Functions.ADDITION))
		{
			System.out.println("Addition ="+(request.getNum1()+request.getNum2()));
		}
		else
		{
			handler.handle(request);
		}
	}


}
