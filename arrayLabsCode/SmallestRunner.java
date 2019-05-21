

public class SmallestRunner
{
	public static void main( String args[] )
	{				
		RaySmallest foo = new RaySmallest();
		System.out.println(foo.go(new int[] {-99,1,2,3,4,5,6,7,8,9,10,12345}));
		System.out.println(foo.go(new int[] {10,9,8,7,6,5,4,3,2,1,-99}));
		System.out.println(foo.go(new int[] {10,20,30,40,50,-11818,40,30,20,10}));
		System.out.println(foo.go(new int[] {32767}));
	}
}