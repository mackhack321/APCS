//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare test = new WordsCompare("abe","ape");
		System.out.println(test);
		test.setWords("giraffe", "gorilla");
		System.out.println(test);
		test.setWords("123", "19");
		System.out.println(test);
		test.setWords("goofy", "godfather");
		System.out.println(test);
	}
}