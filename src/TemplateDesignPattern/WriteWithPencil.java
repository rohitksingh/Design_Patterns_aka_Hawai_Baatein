package TemplateDesignPattern;

public class WriteWithPencil extends WritingInstrument{

	public void sharpenPenicil()
	{
		System.out.println("Sharpen pencil");
	}

	@Override
	public void startInstument() {
		sharpenPenicil();
	}
	
}