package FactoryPatternSample;

public class LowProcess implements Processor{

	@Override
	public void read() {
		
		for(int i=0;i<100;i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}