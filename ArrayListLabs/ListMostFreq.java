import java.util.*;

public class ListMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	
	public static int count(List<Integer> ray, int thing)
	{
		int count = 0;
		for (int num : ray)
		{
			if (num == thing)
			{
				count++;
			}
		}
		return count;
	}
	
	public static int go( List<Integer> ray )
	{
		int highest = Integer.MIN_VALUE;
		for (int num : ray)
		{
			if (count(ray,num) > count(ray,highest))
			{
				highest = num;
			}
		}
		return highest;
	}
}
