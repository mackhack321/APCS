

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{	
	public static int[] makeLucky7Array( int size)
	{
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++)
		{
			double rand = Math.random();
			rand *= 10;
			arr[i] = (int)rand+1;
		}
		return arr;
	}
	public static void shiftEm(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == 7)
			{
				boolean done = false;
				int count = 0;
				while (!done)
				{
					if (array[count] != 7)
					{
						array[i] = array[count];
						array[count] = 7;
						done = true; break;
					}
					else 
					{
						count++;
					}
				}		
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
}