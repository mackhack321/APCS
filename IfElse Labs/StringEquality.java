//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		setWords("foo","bar");
	}

	public StringEquality(String one, String two)
	{
		setWords(one,two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one; wordTwo = two;
	}

	public boolean checkEquality( )
	{
		return wordOne.equals(wordTwo);
	}

	public String toString()
	{
		if (checkEquality()) {return wordOne + " has the same letters as " + wordTwo + "\n";}
		else {return wordOne + " does not have the same letters as " + wordTwo + "\n";}
	}
}