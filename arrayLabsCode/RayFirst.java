

public class RayFirst
{
	public static boolean go(int[] ray)
	{
		if (ray.length<1) {return false;}
		int first = ray[0];
		int count = 0;
		for (int num : ray)
		{
			if (num==first) {count++;}
		}
		return count>1;
	}
}