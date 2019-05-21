public class WordPairListRunner 
{
	public static void main(String[] args) 
	{
		WordPair x = new WordPair( "dog", "cat");
		System.out.println( x.getFirst() );
		System.out.println( x.getSecond() );

		String[] aplus = {"one", "two", "three" };
		WordPairList one = new WordPairList( aplus );
		System.out.println( one );	

		System.out.println( one.numMatches() );			
		
		aplus = new String[]{"the", "red", "fox", "the", "red" };
		one = new WordPairList( aplus );
		System.out.println( one );
		
		System.out.println( one.numMatches() );	
			
			
		aplus = new String[]{"the", "more", "the", "merrier" };
		one = new WordPairList( aplus );
		System.out.println( one );
		
		System.out.println( one.numMatches() );
		
		aplus = new String[]{"aplus", "comp", "sci", "rocks", "comp", "sci", "rocks" };
		one = new WordPairList( aplus );
		System.out.println( one );
		
		System.out.println( one.numMatches() );						
	}
}


/*
 
dog
cat
[one two, one three, two three]
0
[the red, the fox, the the, the red, red fox, red the, red red, fox the, fox red, the red]
2
[the more, the the, the merrier, more the, more merrier, the merrier]
1
[aplus comp, aplus sci, aplus rocks, aplus comp, aplus sci, aplus rocks, comp sci, comp rocks, comp comp, comp sci, comp rocks, sci rocks, sci comp, sci sci, sci rocks, rocks comp, rocks sci, rocks rocks, comp sci, comp rocks, sci rocks]
3

*/