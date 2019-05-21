
import static java.lang.System.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayStats
{
	int[] arr;
	List<Integer> uniques = new ArrayList<Integer>();
	
	public ArrayStats(int[] _arr)
	{
		setArr(_arr);
	}
	
	public void setArr(int[] _arr)
	{
		arr = _arr;
		count();
	}
	
	public void count()
	{
		for (int num : arr)
		{
			if (!uniques.contains(num))
			{
				uniques.add(num);
			}
		}
	}
	
	public int count(int size)
	{
		int count = 0;
		for (int num : arr)
		{
			if (num==size)
			{
				count++;
			}
		}
		return count;
	}
	
	public String toString()
	{
		String ans = "";
		ans += "0 - "+count(0)+"\n";
		ans += "1 - "+count(1)+"\n";
		ans += "2 - "+count(2)+"\n";
		ans += "3 - "+count(3)+"\n";
		ans += "4 - "+count(4)+"\n";
		ans += "5 - "+count(5)+"\n";
		ans += "6 - "+count(6)+"\n";
		ans += "7 - "+count(7)+"\n";
		ans += "8 - "+count(8)+"\n";
		ans += "9 - "+count(9);
		
		return ans;
	}
}