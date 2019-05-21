//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYearRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a year :: ");
		boolean isLeap = LeapYear.isLeapYear(keyboard.nextInt());
		if (isLeap) {System.out.println("That is a leap year.");}
		if (!isLeap) {System.out.println("That is not a leap year.");}
	}
}