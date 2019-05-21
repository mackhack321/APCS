//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		System.out.printf("%.2f\n", Discount.getDiscountedBill(amt));
	}
}