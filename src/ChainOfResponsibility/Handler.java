package ChainOfResponsibility;

public abstract class Handler {

	protected Handler handler;
	
	public void next(Handler handler)
	{
		this.handler=handler;
	}
	
	public abstract void handle(Numbers request);
	
}
