

import java.util.*;

public class MostFreqRunner
{
	public static void main( String args[] )
	{
		RayMostFreq rt = new RayMostFreq();
		
		System.out.println( rt.go( new int[]{-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5} ) );
		System.out.println( rt.go( new int[]{10,9,8,7,6,5,4,3,2,1,-99} ) );
		System.out.println( rt.go( new int[]{10,20,30,40,50,-11818,40,30,20,10} ) );
		System.out.println( rt.go( new int[]{32767} ) );
		System.out.println( rt.go( new int[]{255,255} ) );
	}
}