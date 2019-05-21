
//String indexOf() method

import static java.lang.System.*;

public class IndexOf
{
   public static void main( String args[] )
   {
		String s = "apluscs";
		int index = s.indexOf("us");
		out.println(index);
		index = s.indexOf("c");
		out.println(index);
		index = s.indexOf('x');
		out.println(index);
		
		index = s.indexOf("pl");
		out.println(index);
		index = s.lastIndexOf('c');
		out.println(index);
		index = s.lastIndexOf("plus");
		out.println(index);
  }
}