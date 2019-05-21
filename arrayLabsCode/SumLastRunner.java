

public class SumLastRunner
{
	public static void main( String args[] )
	{
		RaySumLast rst = new RaySumLast();
		
		System.out.println( rst.go( new int[]{-99,1,2,3,4,5,6,7,8,9,10,5} ) );
		System.out.println( rst.go( new int[] {9,10,-8,10000,-5000,-3000} ) );
		System.out.println( rst.go( new int[]{32767} ) );
	}
}