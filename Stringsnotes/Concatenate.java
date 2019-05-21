
//String concatenation example

import static java.lang.System.*;

public class Concatenate
{
   public static void main( String args[] )
   {
		String one = "apluscomp";
		String two = "-sci";
		
		String s = one.substring(0,4) + two;
		out.println(s);
		out.println(s.length());

		String what = s.concat(two);		//adding strings together
		out.println(what);
		out.println(what.length());
	}
}