//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class SocialRunner
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter social :: ");
		String soc = sc.nextLine();
		Social test = new Social(soc);
		test.chopAndAdd();
		System.out.println(test);
	}
}