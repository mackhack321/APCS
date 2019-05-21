
import java.util.*;

public class ListGetLast
{
	//method go will return a list
	//containing the all of the values greater 
	//than the last value in the list
	public static List<Integer> go(  List<Integer> ray )
	{
		int last = ray.get(ray.size()-1);
		List<Integer> nums = new ArrayList<Integer>();
		for (int num : ray)
		{
			if (num > last)
			{
				nums.add(num);
			}
		}
		
		return nums;
	}
}
