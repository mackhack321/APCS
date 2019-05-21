

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int oddpos = -1;
		
		for (int i = 0; i < ray.size(); i++)
		{
			if (ray.get(i) % 2 != 0)
			{
				oddpos = i;
				break;
			}
		}
		
		int evenpos = -1;
		
		for (int i = ray.size()-1; i >= 0; i--)
		{
			if (ray.get(i) % 2 == 0)
			{
				evenpos = i;
				break;
			}
		}
		
		System.out.println("Oddpos: "+oddpos+" Evenpos: "+evenpos);
		
		return (oddpos == -1 || evenpos == -1) ? -1 : evenpos-oddpos;
	}
}
