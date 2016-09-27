package OldFashionWayWithoutCommandDesign;

public class RemoteTest {

	public static void main(String[] args)
	{
		Remote remote=new Remote();
		remote.setOption("LightOn");
		remote.buttonPressed();
	}
}