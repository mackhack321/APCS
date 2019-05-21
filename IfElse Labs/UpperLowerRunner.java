//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class UpperLowerRunner
{
	public static void main( String args[] )
	{
		UpperLower s = new UpperLower();
		
		System.out.println( s.go(  "D0g", true )  );
		System.out.println( s.go(  "aplus", false )  );
		System.out.println( s.go(  "catgiraffe", false )  );
		System.out.println( s.go(  "ApLuS", true )  );
		System.out.println( s.go(  "ApLuS", false )  );
		System.out.println( s.go(  "#d0G# ", true )  );
		System.out.println( s.go(  "#d0G# ", false )  );
		System.out.println( s.go(  "aplusdog#13337#", false )  );
		System.out.println( s.go(  "CoEe1234", true) );
		System.out.println( s.go(  "wow", true )  );
		System.out.println( s.go(  "77777" , true )  );
		System.out.println( s.go(  "77777" , false )  );
		
	}
}