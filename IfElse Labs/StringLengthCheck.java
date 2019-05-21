//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringLengthCheck
{
	public static String check( String one, String two )
	{
		if (one.length() == two.length()) {return one+" has the same number of of letters as "+two;}
		else {return one+" does not have the same number of of letters as "+two;}
	}
}