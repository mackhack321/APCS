package apollo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Apollo {
	private List<Double> values;
	private String filename;
	private final double OFFSET = 180.00;
	
	public Apollo(String filename)
	{
		this.filename = filename;
		values = new ArrayList<Double>();
		getDataFromFile();
	}
	
	public void getDataFromFile()
	{
		BufferedReader reader;
		try
		{
			reader = new BufferedReader(new FileReader(filename));
			String line = reader.readLine();
			while (line != null)
			{
				String[] words = line.split(" ");
				for (int i = 0; i < words.length; i++)
				{
					values.add(Double.parseDouble(words[i]));
				}
				line = reader.readLine();
			}
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
	
	public void checkAngles()
	{
		for (int i = 1; i < values.size(); i++)
		{
			if (values.get(i) - OFFSET < 0)
			{
				double newangle = 360 + (values.get(i) - 180);
				DecimalFormat df = new DecimalFormat("###.##");
				newangle = Double.parseDouble(df.format(newangle));
				values.set(i, newangle);
			} else
			{
				DecimalFormat df = new DecimalFormat("###.##");
				values.set(i, Double.parseDouble(df.format(values.get(i) - OFFSET)));
			}
		}
	}
	
	public String calculate()
	{
		checkAngles();
		String ans = "";
		for (int i = 1; i < values.size(); i++)
		{
			ans += values.get(i);
			if (i % 3 == 0)
			{
				ans += "\n";
			} else {ans += " ";}
		}
		return ans;
	}
	
	public void showValues()
	{
		System.out.println(values.toString());
	}
}
