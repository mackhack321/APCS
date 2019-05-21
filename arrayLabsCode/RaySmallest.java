

public class RaySmallest
{
	public static int go(int[] ray)
	{
		int smallest = 999999999; // sure hope you don't have anything bigger than that in your array; this code won't work if you do
		for (int num : ray)
		{
			if (num < smallest)
			{
				smallest = num;
			}
		}
		return smallest;
	}
}