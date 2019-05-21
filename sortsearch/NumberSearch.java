

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearch
{
	public static int getNextLargest(int[] numArray, int searchNum)
	{
		Arrays.sort(numArray);
		for (int num : numArray)
		{
			if (num > searchNum)
			{
				return num;
			}
		}
		return -1;
	}
}