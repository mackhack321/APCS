import java.util.*;

public class ArrayTesterRunner 
{
	public static void main(String[] args) 
	{
		int[][] aplus = {{1,2,3,4},{4,3,2,1},{1,3,2,3},{12,12,12,12},{13,13,14,15}};
		int[] it = ArrayTester.getColumn( aplus, 3 );
		System.out.println( Arrays.toString( it ) );
		
		System.out.println( ArrayTester.containsDuplicates( aplus[0] ) );
		
		System.out.println( ArrayTester.containsDuplicates( aplus[1] ) );
		
		System.out.println( ArrayTester.containsDuplicates( aplus[2] ) );
		
		System.out.println( ArrayTester.containsDuplicates( aplus[3] ) );
		
		System.out.println( ArrayTester.containsDuplicates( aplus[4] ) );
		
		System.out.println( ArrayTester.hasAllValues( aplus[0], aplus[1] ) );
		
		System.out.println( ArrayTester.hasAllValues( aplus[2], aplus[1] ) );
		
		int[][] x = {{1,2},{1,2}};
		System.out.println( ArrayTester.isLatin( x ) );
		
		int[][] y = {{1,2},{2,1}};
		System.out.println( ArrayTester.isLatin( y ) );
		
		int[][] z = {{1,2,3},{2,3,1},{3,1,2}};
		System.out.println( ArrayTester.isLatin( z ) );
		
		int[][] a = {{1,2,3},{2,3,1},{2,1,3}};
		System.out.println( ArrayTester.isLatin( a ) );		
	}
}


/*

[3, 2, 2, 12, 14]
false
false
true
true
true
true
false
false
true
true
false

*/