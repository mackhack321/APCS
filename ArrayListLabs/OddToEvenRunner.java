import java.util.Arrays;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ListOddToEven s = new ListOddToEven();
		
		System.out.println( s.go( Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11) ) );
		System.out.println( s.go( Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7)));
		System.out.println( s.go( Arrays.asList(2,4,6,8,8)));
	}
}
