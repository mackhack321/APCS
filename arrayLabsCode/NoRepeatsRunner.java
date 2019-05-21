

import java.util.*;

public class NoRepeatsRunner
{
	public static void main( String args[] )
	{
		RayNoRepeats rt = new RayNoRepeats();
		System.out.println( rt.go( new int[]{-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5} ) );
		System.out.println( rt.go( new int[]{10,9,8,7,6,5,4,3,2,1,-99} ) );
		System.out.println( rt.go( new int[]{10,20,30,40,50,10,10,40,30,20,10} ) );
		System.out.println( rt.go( new int[]{32767} ) );
	}
}