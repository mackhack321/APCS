

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> factors = new ArrayList<Integer>();
		
		for (int i = 2; i < number; i++)
		{
			if (number % i == 0)
			{
				factors.add(i);
			}
		}
		return factors;
	}
	
	public static ArrayList<Integer> keepOnlyCompositeNumbers( List<Integer> nums )
	{
		ArrayList<Integer> composites = new ArrayList<Integer>();
		for (int num : nums)
		{
			if (getListOfFactors(num).size() > 0)
			{
				composites.add(num);
			}
		}
		return composites;
	}
}
