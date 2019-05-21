

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int ans = 0;
		for (int num : ray)
		{	
			if (num>ray[ray.length-1])
			{
				ans += num;
			}
		}
		return (ans>0) ? ans:-1;
	}
}