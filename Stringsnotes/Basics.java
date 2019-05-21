
//String basics - constructors and initialization

import static java.lang.System.*;

public class Basics
{
   public static void main( String args[] )
   {
		String s = "apluscompsci";
		String champ = new String("aplus");
		out.println(s + " " + champ);
		
		System.out.println( s.indexOf( 'c' ) );
	}
}