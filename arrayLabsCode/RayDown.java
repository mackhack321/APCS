

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		int check = numArray[0];
		for (int i = 1; i < numArray.length; i++)
		{
			if (numArray[i]>check)
			{
				return false;
			}
			check=numArray[i];
		}
		return true;
	}	
}