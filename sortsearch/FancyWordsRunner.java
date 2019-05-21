

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class FancyWordsRunner
{
	public static void main( String args[] ) throws IOException
	{
		FancyWords foo = new FancyWords("PROGRAMMING IS FUN");
		System.out.println(foo);
		foo = new FancyWords("2003 TCEA STATE CONTEST");
		System.out.println(foo);
		foo = new FancyWords("TODAY IS SATURDAY");
		System.out.println(foo);
	}
}