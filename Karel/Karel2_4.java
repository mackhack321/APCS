import kareltherobot.*;
import java.awt.Color;

public class Karel2_4 implements Directions
{
	public static void main (String [] args)
	{
	    // create and exercise robots here.
	    UrRobot karel = new UrRobot (5, 4, East, 0);
	    
	}

	static
	{
		World.readWorld("fig2_4.kwld");
		World.setVisible(true);
		World.setDelay(30);
		World.showSpeedControl(true);
	}

}