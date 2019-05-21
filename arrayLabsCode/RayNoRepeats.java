import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RayNoRepeats
{
	//method go will return true if there
	//are no numbers that repeat
	//false if any numbers repeat
	public static boolean go(int[] ray)
	{		
		List<Integer> knowngood = new ArrayList<Integer>();
		for (int num : ray)
		{
			if (!knowngood.contains(num))
			{
				knowngood.add(num);
			}
		}
		return knowngood.size()==ray.length;
	}
}