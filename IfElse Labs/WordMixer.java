//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -

import static java.lang.System.*;

public class WordMixer
{
	public static String moveEmAround(String a, int x)
	{
		if (a.length()<x) {return "no can do";}
		String chunk = a.substring(0, x);
		a = a.substring(x,a.length());
		return a+chunk;
	}
}