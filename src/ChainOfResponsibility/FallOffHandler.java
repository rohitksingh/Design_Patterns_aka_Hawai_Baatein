package ChainOfResponsibility;

public class FallOffHandler extends Handler{

	@Override
	public void handle(Numbers request) {
		System.out.println("Handler not found");
	}

}