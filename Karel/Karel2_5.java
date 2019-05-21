import kareltherobot.*;
public class Karel2_5 implements Directions
{
	public static void main (String [] args)
	{
	// create and exercise robots here.
	
	}

	static
	{ 
		World.readWorld("fig2_5.kwld");
		World.setVisible(true);
		World.setDelay(30);
		World.showSpeedControl(true);
	}

}