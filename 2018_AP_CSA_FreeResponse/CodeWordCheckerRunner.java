public class CodeWordCheckerRunner
{
	public static void main(String[] args) 
	{
		StringChecker aplus = new CodeWordChecker( 5, 8, "$" );
		System.out.println( aplus.isValid( "happy" ) );
		System.out.println( aplus.isValid( "happy$" ) );
		System.out.println( aplus.isValid( "$happy" ) );
		System.out.println( aplus.isValid( "hap$py" ) );
		System.out.println( aplus.isValid( "Code" ) );
		System.out.println( aplus.isValid( "apluscompsci" ) );
		System.out.println( aplus.isValid( "apluscom" ) );
		System.out.println( aplus.isValid( "pscirox" ) );		
	}
}

/*

true
false
false
false
false
false
true
true

*/
