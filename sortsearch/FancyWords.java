

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;
	private int longest;

	public int getLenOfLongest()
	{
		int longest = 0;
		for (String word : wordRay)
		{
			if (word.length()>longest)
			{
				longest = word.length();
			}
		}
		return longest;
	}
	
	public String[] reverseArr()
	{
		List<String> ls = Arrays.asList(wordRay);
		Collections.reverse(ls);
		String[] newArr = new String[ls.size()];
		newArr = ls.toArray(newArr);
		return newArr;
	}
	
	public String reverse(String word)
	{
		String ans = "";
		for (int i = word.length() - 1 ; i >= 0 ; i--)
		{
			ans += word.charAt(i);
		}       
		return ans;
	}
	
	public FancyWords(String sentence)
	{
		wordRay = sentence.split(" ");
		longest = getLenOfLongest();
		wordRay = reverseArr();
		for (int i = 0; i < wordRay.length; i++)
		{
			wordRay[i] = reverse(wordRay[i]);
		}
	}

	public String toString()
	{
		String ans = "";
		for (int i = 0; i < longest; i++)
		{
			for (String word : wordRay)
			{
				try
				{
					ans += word.toCharArray()[i];
				}
				catch (Exception e)
				{
					ans += " ";
				}
			}
			ans += "\n";
		}
		ans += "\n\n";
		return ans;
	}
}