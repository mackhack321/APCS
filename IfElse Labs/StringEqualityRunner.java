//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter word one :: ");
		String wordOne = sc.nextLine();
		System.out.print("Enter word two :: ");
		String wordTwo = sc.nextLine();
		StringEquality test = new StringEquality(wordOne,wordTwo);
		System.out.println(test);
	}
}