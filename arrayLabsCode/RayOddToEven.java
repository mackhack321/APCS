

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int oddloc = -1;
		int evenloc = -1;
		for (int i = 0; i < ray.length; i++)
		{
			if (ray[i] % 2 != 0)
			{
				oddloc = i; break;
			}
		}
		
		for (int i = oddloc+1; i < ray.length; i++)
		{
			if (ray[i] % 2 == 0)
			{
				evenloc = i; break;
			}
		}
		
		if (oddloc == -1 || evenloc == -1)
		{
			return -1;
		}
		
		return evenloc-oddloc;
	}
}