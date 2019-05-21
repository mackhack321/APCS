public class Social
{
   public static String go( String a )
	{
	   	if (a.indexOf("-") == 3 && a.lastIndexOf("-") == 6)
	   	{
	   		return a.substring(7, a.length());
	   	}
		return "bad";
	}
}



/*

EXPECTED RUNNER OUTPUT
 
good
bad
good
bad
good
good
bad
bad




*/
