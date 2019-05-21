

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		return count;
	}

	public static Object[] getSortedDigitArray(int number)
	{
		List<Integer> nums = new ArrayList<Integer>();
		for (; number != 0; number /= 10)
		{
			nums.add(number%10);
		}
		
		Object[] arr = nums.toArray();
		Arrays.sort(arr);
		return arr;
	}
}