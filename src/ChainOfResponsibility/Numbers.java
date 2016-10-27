package ChainOfResponsibility;

public class Numbers {
	
	private int num1;
	private int num2;
	private String func;
	
	public Numbers(int num1,int num2,String func)
	{
		this.num1=num1;
		this.num2=num2;
		this.func=func;
	}
	
	public int getNum1()
	{
		return num1;
	}
	
	public int getNum2()
	{
		return num2;
	}
	
	public String getFunc()
	{
		return func;
	}

}