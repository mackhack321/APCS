package inspiration;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Inspiration {
	// lists //
	private List<String> quotes;
	private List<String> authors;
	// constants //
	private final String RANDOM = "1";
	private final String SEARCH = "2";
	private final String ADD = "3";
	private final String EXIT = "4";
	// miscellaneous //
	Scanner sc;
	JSONParser p;
	
	public Inspiration() // build lists by parsing JSON
	{
		quotes = new ArrayList<String>();
		authors = new ArrayList<String>();
		
		p = new JSONParser();
		sc = new Scanner(System.in);
		
		try {
			JSONArray arr = (JSONArray) p.parse(new FileReader("quotes.json"));
			
			for (Object obj : arr) // for each JSON object in the file
			{
				String quote = (String) ((HashMap<?, ?>) obj).get("text");
				String author = (String) ((HashMap<?, ?>) obj).get("from");
				
				quotes.add(quote.replace("“", ""));
				authors.add(author.replace("“", ""));
			}
		}
		
		catch (IOException | ParseException e) { // file not found or could not parse
			e.printStackTrace();
		}
	}
	
	public String prettyQuote(int index) // properly formatted quote: "QUOTE" ~ AUTHOR
	{
		return "\"" + quotes.get(index) + "\" ~ " + authors.get(index);
	}
	
	public String getQuote() // random quote
	{
		int index = ThreadLocalRandom.current().nextInt(0,quotes.size()+1);
		return prettyQuote(index);
	}
	
	public String getQuote(String term) // quote from search term
	{
		List<Integer> goods = new ArrayList<Integer>();
		String ans = "";
		
		for (int i = 0; i < quotes.size(); i++) // for each quote in quotes list
		{
			if (quotes.get(i).contains(" "+term+" ")) {goods.add(i);}
		}
		
		for (int i = 0; i < goods.size(); i++) // for each search result
		{
			ans += prettyQuote(goods.get(i));
			if (i < goods.size() - 1) {ans+="\n";}
		}
		
		return (goods.size() > 0) ? ans : "Sorry, your search has no results.";
	}
	
	public String addQuote(String text, String author) // append quote to JSON file
	{
		try {
			Object obj = p.parse(new FileReader("quotes.json"));
			JSONObject quote = new JSONObject();
			JSONArray arr = (JSONArray) obj;
			
			quote.put("text", text); quote.put("from", author);
			
			arr.add(quote);
			
			FileWriter fw = new FileWriter("quotes.json");
			fw.write(arr.toJSONString());
			fw.flush(); fw.close();
			
			return "Added quote: \"" + text + "\" ~ " + author;
		}
		
		catch (IOException | ParseException e) { // file not found or could not parse
			e.printStackTrace();
		}
		
		return "CODE IS BROKEN";
	}
	
	public String launcher() // return user choice from launcher
	{
		System.out.print("Would you like to...\n1) Get a random quote,\n2) Search for a quote using a keyword,\n3) Add a new quote, or\n4) Exit?\nEnter choice :: ");
		return sc.next();
	}
	
	public void spin() // main function
	{
		boolean done = false;
		while (!done)
		{
			String result = launcher();
			if (result.equals(RANDOM))
			{
				System.out.println(getQuote());
			}
			else if (result.equals(SEARCH))
			{
				System.out.print("Enter search term :: ");
				sc.nextLine();
				String term = sc.nextLine();
				System.out.println(getQuote(term));
			}
			else if (result.equals(ADD))
			{
				System.out.println("Enter the quote (exclude quotation marks) :: ");
				sc.nextLine();
				String text = sc.nextLine();
				
				System.out.println("Enter the quote author :: ");
				String from = sc.nextLine();
				
				System.out.println(addQuote(text, from));
			}
			else if (result.equals(EXIT)) {System.exit(0);}
			else {continue;}
			
			System.out.print("Done? (y/n) :: ");
			done = sc.next().equals("y");
		}
	}
}
