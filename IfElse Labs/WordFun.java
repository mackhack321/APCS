//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordFun
{
	private String word;

	public WordFun()
	{
		setWord("foo");
	}

	public WordFun(String w)
	{
		setWord(w);
	}

	public void setWord(String w)
	{
		word = w;
	}

	public void makeUpper()
	{
		word = word.toUpperCase();
	}

	public void addHyphen()
	{
		word = word.replace(' ', '-');

	}

	public String toString()
	{
		return word;
	}
}