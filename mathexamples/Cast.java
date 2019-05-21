// casting is (super) cool!

import static java.lang.System.*;

public class Cast
{
   public static void main( String args[] )
   {
   		System.out.println((int)3.14159);
		System.out.println((double)3);

		int one = 0;				//32 bit int
		long big = 453;			//64 bit int
		double dec = 7.56;		//64 bit real


		one = (int)dec;    		//legal
		System.out.println(one);

		one = (int)big;    		//legal
		System.out.println(one);

		big = (long)dec;    		//legal
		System.out.println(big);

		  //uncomment and recompile
		//one = dec;    				//illegal
		//one = big;    				//illegal
		
   }
}
