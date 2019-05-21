//return method example 1

import static java.lang.System.*;

public class ReturnOne
{
	public int twice(int x)
	{
		return 2*x;
	}

	public static void main(String[] args)
	{
		ReturnOne demo = new ReturnOne();

		out.println("First value returned :: " + demo.twice(25) );
		out.println("Second value returned :: " + demo.twice(225) );

		//sqrt is a return method
		out.println("\n\nSquare root of 25 :: " + Math.sqrt(25) );
	}
}
