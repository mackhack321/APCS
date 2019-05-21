

import java.util.List;
import java.util.ArrayList;

public class ListGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static List<Integer> go( List<Integer> ray )
	{
		List<Integer> nums = new ArrayList<Integer>();
		for (int num : ray)
		{
			if (num > 11)
			{
				nums.add(num);
			}
			
			if (nums.size() == 3)
			{
				break;
			}
		}
		
		return nums;
	}
}
