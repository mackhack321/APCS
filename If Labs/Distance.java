//(c) A+ Computer Science
// www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,y1,x2,y2;
	private double distance;
	
	public Distance()
	{


	}

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		setCoordinates(xOne,yOne,xTwo,yTwo);
	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1 = xOne;
		x2 = xTwo;
		y1 = yOne;
		y2 = yTwo;
		distance = getDistFromCoords(xOne,yOne,xTwo,yTwo);
	}

	public static double getDistFromCoords(int xOne, int yOne, int xTwo, int yTwo)
	{
		return Math.sqrt(Math.pow((xTwo-xOne),2)+Math.pow((yTwo-yOne),2));
	}
	
	public String determineClosest()
	{
		String result="";
		double distA = getDistFromCoords(x1,y1,0,0);
		double distB = getDistFromCoords(x2,y2,0,0);
		if (distA>distB) {return "B IS CLOSER";}
		if (distB>distA) {return "A IS CLOSER";}
		if (distB==distA) {return "A AND B ARE ON TOP OF EACH OTHER.  CONSIDER CHECKING THAT OUT.";}
		return "This code is broken.  Go tell Mack to write better code.";
	}
	
	public String toString()
	{
		return "";
	}
}