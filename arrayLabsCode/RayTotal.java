

public class RayTotal
{
	public static int go(int[] ray)
	{
		int ans = 0;
		for(int num : ray)
		{
			ans += num;
		}
		return ans;
	}
}