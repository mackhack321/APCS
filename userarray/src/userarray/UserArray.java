package userarray;

import java.util.Arrays;
import java.util.Scanner;

public class UserArray {
	
	private static Scanner sc = new Scanner(System.in);
	private static int[] arr;	
	
	public static void makeArray()
	{
		System.out.print("Enter array size :: ");
		arr = new int[sc.nextInt()];
	}
	
	public static String getContents() {
		String ans = "Array Contents:\n";
		for (int i = 0; i < arr.length; i++)
		{
			ans += i + ": " + arr[i] + "\n";
		}
		return ans;
	}
	
	public static void populate() {
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print("Enter integer for index " + i + " :: ");
			arr[i] = sc.nextInt();
		}
	}
	
	public static String change(int index, int newVal) {
		try {
			arr[index] = newVal; return "Changed index " + index + " to " + newVal;
		} catch (ArrayIndexOutOfBoundsException e) {
			return "ERROR: That index does not exist.";
		}
	}
	
	public static void spinForChanges() {
		boolean done = false;
		while (!done)
		{
			System.out.println(getContents());
			System.out.print("Would you like to edit anything? (y/n) :: "); String ans = sc.next();
			if (ans.equals("y"))
			{
				System.out.print("Which index would you like to edit? :: "); int index = sc.nextInt();
				System.out.print("Change to what? :: "); int newVal = sc.nextInt();
				System.out.println(change(index, newVal));
				System.out.println(getContents());
			}
			System.out.print("Done? (y/n) :: "); done = sc.next().equals("y");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("// Integer Array Manager //\n");
		makeArray();
		populate();
		spinForChanges();
	}

}
