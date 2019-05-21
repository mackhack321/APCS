package wordsearch;

import java.io.*;
import java.util.Scanner;

public class WordSearch {

	public static void findWord(String word) throws IOException
	{
		String PATH = "C:\\Users\\mlgpr\\Desktop\\APCS\\WordSearch\\wordsearch\\text.txt";
		BufferedReader br = new BufferedReader(new FileReader(new File(PATH)));
		int count = 0;
		while (true)
		{
			String nextline = "";
			nextline = br.readLine();
			if (nextline == null) {break;}
			if (nextline.indexOf(word) >= 0)
			{
				count++;
			}
		}
		br.close();
		System.out.println("The word '"+word+"' appears "+count+" time(s).");
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("What word do you want to count: :: ");
		String word = sc.nextLine();
		sc.close();
		findWord(word);
	}
}
