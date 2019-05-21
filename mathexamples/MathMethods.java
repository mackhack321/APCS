//math return methods

import static java.lang.System.*;

public class MathMethods
{
  public static void main ( String[] args )
  {
		out.println(Math.floor(3.254));	//		= 3.0
		out.println(Math.ceil(2.45));		//		= 3.0
		out.println(Math.pow(2,7)); 		//		= 128.0
		out.println(Math.abs(-9));			//		= 9

		out.println(Math.sqrt(256));		//		= 16.0
		out.println(Math.sqrt(144));		//		= 12.0

		out.println(Math.round(3.6));		//		= 4

		out.println(Math.max(5,7));		//		= 7
		out.println(Math.max(5,-7));		//		= 5
		out.println(Math.min(5,7));		//		= 5
		out.println(Math.min(5,-7));		//		= -7
  }
}
