import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RayMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int count(int thing, int[] ls)
	{
		int count = 0;
		for (int num : ls)
		{
			if (num == thing)
			{
				count++;
			}
		}
		return count;
	}

	
	public static int go(int[] ray)
	{
		Map<Integer,Integer> counts = new LinkedHashMap<Integer,Integer>();
		List<Integer> uniquenums = new ArrayList<Integer>();
		for (int num : ray) // populate uniquenums with one of each item in ray
		{
			if (!uniquenums.contains(num))
			{
				uniquenums.add(num);
			}
		}
		
		for (int uniquenum : uniquenums) // populate hashmap like "number, instances"
		{
			counts.put(uniquenum, count(uniquenum,ray));
		}
		
		int maxcount = 0;
		
		for (int key : counts.keySet()) // set maxcount to maximum instance count in counts
		{
			if (counts.get(key)>maxcount)
			{
				maxcount = counts.get(key);
			}
		}
		
		List<Integer> goods = new ArrayList<Integer>();
		
		for (int key : counts.keySet()) // check key against maxcount, return key if it's the one
		{
			if (counts.get(key)==maxcount)
			{
				return key;
			}
		}
		return -1;
	}
}