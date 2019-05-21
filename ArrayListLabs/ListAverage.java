

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListAverage
{
	public static double go( List<Integer> ray)
	{
		Collections.sort(ray);
		return (ray.get(0)+ray.get(ray.size()-1)) / 2;
	}
}
