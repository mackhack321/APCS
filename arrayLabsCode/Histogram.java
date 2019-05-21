

import java.util.Scanner;

public class Histogram
{
	int[] arr;

	public Histogram(int[] _arr)
	{
		setArr(_arr);
	}

	public void setArr(int[] _arr)
	{
		arr = _arr;
	}

	private int count(int thing)
	{
		int count = 0;
		for (int num : arr)
		{
			if (num==thing)
			{
				count++;
			}
		}
		return count;
	}
	
	public String toString()
	{
		String ans = "";
		ans += "0 - "+count(0)+"\n";
		ans += "1 - "+count(1)+"\n";
		ans += "2 - "+count(2)+"\n";
		ans += "3 - "+count(3)+"\n";
		ans += "4 - "+count(4)+"\n";
		ans += "5 - "+count(5)+"\n";
		ans += "6 - "+count(6)+"\n";
		ans += "7 - "+count(7)+"\n";
		ans += "8 - "+count(8)+"\n";
		ans += "9 - "+count(9);
		
		return ans;
	}
}