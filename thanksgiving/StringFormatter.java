import java.util.List;

public class StringFormatter {
	int formattedLen = 20;
	List<String> wordList;
	
	public StringFormatter(List<String> wordListIn, int formattedLenIn)
	{
		wordList = wordListIn;
		formattedLen = formattedLenIn;
	}
	
	public static int totalLetters(List<String> wordList)
	{
		int count = 0;
		for (String word : wordList)
		{
			count += word.length();
		}
		return count;
	}
	
	public static int basicGapWidth(List<String> wordList, int formattedLen)
	{
		return ((formattedLen-totalLetters(wordList))/(wordList.size()-1));
	}
	
	public static int leftoverSpaces(List<String> wordList, int formattedLen)
	{
		// implementation implied
		return 0;
	}
	
	public static String format(List<String> wordList, int formattedLen)
	{
		String ans = "";
		for (String word : wordList)
		{
			ans += word;
			if (word==wordList.get(wordList.size()-1)) {return ans;} // makes it not add spaces at last word
			if (leftoverSpaces(wordList, formattedLen)==0)
			{
				for (int i=0; i<basicGapWidth(wordList,formattedLen);i++)
				{
					ans += " ";
				}
			}
		}
		return "code is broken lol";
	}
}
