//String substring() method

import static java.lang.System.*;

public class SubString
{
   public static void main( String args[] )
   {
		String s = "apluscs" , sub ="";
		
		sub = s.substring(3);
		out.println(sub);
		
		sub = s.substring(0,3);
		out.println(sub);
		
		sub = s.substring(4);
		out.println(sub);
	
		sub = s.substring(3);
		out.println(sub);

		sub = s.substring(2,5);
		out.println(sub);

		sub = s.substring(4,6);
		out.println(sub);
   }
}

