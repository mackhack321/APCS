package stringmutation;

import java.util.Scanner;
import java.lang.StringBuilder;

public class StringMutation {

	public static String changeString(String original, String newvalue)
	{
		StringBuilder sb = new StringBuilder(original);
		sb.replace(0, original.length(), newvalue);
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String originalstring = "bob";
		System.out.println("Original Value: "+originalstring);
		System.out.println("New Value: "+changeString(originalstring, "cow"));
	}
}
