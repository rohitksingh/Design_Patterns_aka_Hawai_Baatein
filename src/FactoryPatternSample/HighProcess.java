package FactoryPatternSample;


public class HighProcess implements Processor{

	@Override
	public void read() {
		
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(10);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

