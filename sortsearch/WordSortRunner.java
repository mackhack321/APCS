//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSortRunner
{
	public static void main(String args[])
	{
		WordSort foo = new WordSort("abc ABC 12321 fred alexander");
		System.out.println(foo);
		foo.setList("a zebra friendly acrobatics 435 TONER PRinTeR");
		System.out.println(foo);
		foo.setList("b x 4 r s y $");
		System.out.println(foo);
		foo.setList("123 ABC abc 034 dog cat sally sue bob 2a2");
		System.out.println(foo);
	}
}