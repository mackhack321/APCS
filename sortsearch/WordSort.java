
import java.util.Arrays;
import static java.lang.System.*; 

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
	   setList(line);
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString( )
	{
		sort();
		String output="";
		int count = 0;
		for (String word : wordRay)
		{
			output += "word "+count+" :: "+wordRay[count]+"\n";
			count++;
		}
		return output+"\n\n";
	}
}