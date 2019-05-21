//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a whole number :: ");
		int num = sc.nextInt();
		System.out.println("That number is even :: "+NumberVerify.isEven(num));
		System.out.println("That number is odd :: "+NumberVerify.isOdd(num));
		
		//add in more test cases
	}
}