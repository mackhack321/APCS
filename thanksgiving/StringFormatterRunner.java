import java.util.List;

public class StringFormatterRunner {
	public static void main(String[] args)
	{
		//List<String> wordList = List.of("AP","COMP","SCI","ROCKS");
		List<String> wordList = List.of("BEACH","BALL");
		System.out.println(StringFormatter.format(wordList, 20));	
	}
}
