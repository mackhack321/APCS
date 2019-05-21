

import java.util.*;

public class MostFreqRunner
{
	public static void main( String args[] )
	{
		ListMostFreq s = new ListMostFreq();
		
		System.out.println( s.go( Arrays.asList(-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5) ) );
		System.out.println( s.go( Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99)));
		System.out.println( s.go( Arrays.asList(10,20,30,40,50,-11818,40,30,20,10)));
		System.out.println( s.go( Arrays.asList(250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1)));
	}
}
