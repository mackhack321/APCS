

public class RayGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static int[] go(int[] ray)
	{
		int[] ans = new int[3];
		int anspos = 0;
		
		for (int num : ray)
		{
			if (num>11 && anspos<3)
			{
				ans[anspos] = num;
				anspos++;
			}
		}
		return ans;
	}
}