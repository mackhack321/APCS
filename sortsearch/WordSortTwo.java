

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
		sort();
	}
	
	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString()
	{
		String output="";
		for (String word : wordRay)
		{
			output += word + "\n";
		}
		return output+"\n\n";
	}
}