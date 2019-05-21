

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class WordSortTwoRunner
{
	public static void main( String args[] ) throws IOException
	{
		WordSortTwo foo = new WordSortTwo("WHAT TIME WAS IT?");
		System.out.println(foo);
		foo = new WordSortTwo("THE BIG BROWN FOX IS LAZY!");
		System.out.println(foo);
		foo = new WordSortTwo("I AM SAM SAM I AM SAM IS BIG");
		System.out.println(foo);
		foo = new WordSortTwo("1234 ONE TWO 5678");
		System.out.println(foo);
		foo = new WordSortTwo("a b i j 1 2 3");
		System.out.println(foo);
	}
}