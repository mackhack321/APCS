

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		RayOddToEven foo = new RayOddToEven();
		System.out.println(foo.go(new int[] {7,1,5,3,11,5,6,7,8,9,10,12345,11}));
		System.out.println(foo.go(new int[] {11,9,8,7,6,5,4,3,2,1,-99,7}));
		System.out.println(foo.go(new int[] {2,4,6,8,8}));
		System.out.println(foo.go(new int[] {7,7,7,11,2,7,7,11,11,2}));
	}
}