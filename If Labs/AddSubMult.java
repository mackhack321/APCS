//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if (a==b) {return a*b;}
		if (a>b)
		{ return a-b; }
		if (a<b) { return b-a; }
		return 0.0;
	}
}