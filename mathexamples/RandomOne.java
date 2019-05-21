//random example

import java.lang.Math;
import java.util.Random;

public class RandomOne
{
	public static void main ( String[] args )
	{
		double decOne;
		int intOne;

		//Math.random()
		decOne = Math.random()*10;
		intOne = (int)(Math.random() * 10);  //this line needs help // needed parentheses around casted object



		//Random class
		System.out.println("Math.random()");
		System.out.println(decOne);
		System.out.println(intOne);   //why does it always output 0? // fixed now

		System.out.println("\n\nRandom Class");
		Random rand = new Random();
		intOne = rand.nextInt(256);
		System.out.println(intOne);
		intOne = rand.nextInt(256);
		System.out.println(intOne);
		intOne = rand.nextInt(256);
		System.out.println(intOne);
	}
}
