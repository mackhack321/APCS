//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

public class LastFirst
{
	public static String check(String s)
	{
		if (String.valueOf(s.charAt(0)).compareTo(String.valueOf(s.charAt(s.length()-1)))>0)
		{
			return "aplus";
		}
		if (String.valueOf(s.charAt(0)).compareTo(String.valueOf(s.charAt(s.length()-1)))<0)
		{
			return "compsci";
		}
		return "apluscompsci";
	}
}