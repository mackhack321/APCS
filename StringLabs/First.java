
public class First
{
   public static String go( String a )
	{
	    String first = String.valueOf(a.charAt(0));
		return (a.indexOf(first)!=a.lastIndexOf(first)) ? "yes":"no";
	}
}



/*

EXPECTED RUNNER OUTPUT
 
no
yes
no
no
yes
no
yes
yes
no
no


*/
