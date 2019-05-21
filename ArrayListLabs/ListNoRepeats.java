

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListNoRepeats
{
	//method go will return true if there
	//are no numbers that repeat
	//false if any numbers repeat
	public static boolean go( List<Integer> ray)
	{
		List<Integer> uniques = new ArrayList<Integer>();
		for (int num : ray)
		{
			if (!uniques.contains(num))
			{
				uniques.add(num);
			}
		}
		
		return uniques.size()==ray.size();
	}
}
