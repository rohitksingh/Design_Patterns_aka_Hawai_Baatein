package ChainOfResponsibility;

public class SubHandler extends Handler {

	@Override
	public void handle(Numbers request) {
		if(request.getFunc().equals(Functions.SUBTRACTION))
		{
			System.out.println("Subtraction ="+(request.getNum1()-request.getNum2()));
		}
		else
		{
			handler.handle(request);
		}
	}

}