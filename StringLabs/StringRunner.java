
import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word :: ");
		String word = sc.nextLine();
		StringOddOrEven foo = new StringOddOrEven(word);
		System.out.println(foo);
	}
}
