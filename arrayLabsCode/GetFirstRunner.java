

import java.util.*;

public class GetFirstRunner
{
	public static void main( String args[] )
	{		
		RayGetFirst foo = new RayGetFirst();
		Integer[] ans = foo.go(new int[] {-99,1,2,3,4,5,6,7,8,9,10,5});
		System.out.println(Arrays.toString(ans));
		
		Integer[] again = foo.go(new int[] {10,9,8,7,6,5,4,3,2,1,-99});
		System.out.println(Arrays.toString(again));
	}
}