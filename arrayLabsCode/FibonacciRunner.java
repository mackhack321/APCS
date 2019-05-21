

public class FibonacciRunner
{
	public static void main(String args[])
	{
		int size = 50; // change size here
		Fibonacci foo = new Fibonacci(size);
		int which = 46; // set which number to get here
		try
		{System.out.println(foo.getList().get(which-1));}
		catch (Exception e)
		{System.out.println(-1);}
	}
}