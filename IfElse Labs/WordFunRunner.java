//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordFunRunner
{
	public static void main( String args[] )
	{
	   WordFun test = new WordFun("Hello World");
	   out.println(test);
	   test.makeUpper();
	   out.println(test);
	   test.addHyphen();
	   out.println(test);

	   test.setWord("Jim Bob");
	   out.println(test);
	   test.makeUpper();
	   out.println(test);
	   test.addHyphen();
	   out.println(test);
	}
}