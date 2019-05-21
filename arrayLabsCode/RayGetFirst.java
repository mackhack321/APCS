import java.util.ArrayList;
import java.util.List;

public class RayGetFirst
{
	//method go will return an array
	//containing all values > the first value in the array
	//from the array parameter ray
	public static Integer[] go(int[] ray)
	{
		List<Integer> ans = new ArrayList<Integer>();
		int first = ray[0];
		for (int num : ray)
		{
			if (num > first)
			{
				ans.add(num);
			}
		}
		Integer[] foo = new Integer[ans.size()];
		return ans.toArray(foo);
	}
}