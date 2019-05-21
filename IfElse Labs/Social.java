//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
		setWord("000-00-0000");
	}

	public Social(String soc)
	{
		setWord(soc);
	}


	public void setWord(String w)
	{
		socialNum = w;
	}

	public void chopAndAdd()
	{
		String soc = socialNum;
		String split[] = soc.split("-");
		sum = Integer.valueOf(split[0])+Integer.valueOf(split[1])+Integer.valueOf(split[2]);
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}