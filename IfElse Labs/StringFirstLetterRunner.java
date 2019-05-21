//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class StringFirstLetterRunner
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter word one :: ");
		String wordOne = sc.nextLine();
		System.out.print("Enter word two :: ");
		String wordTwo = sc.nextLine();
		StringFirstLetterCheck test = new StringFirstLetterCheck(wordOne,wordTwo);
		System.out.println(test);

	}
}