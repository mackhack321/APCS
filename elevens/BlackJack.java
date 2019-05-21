public class BlackJack extends Card
{
	private int val;
	
	public BlackJack(String s, int f)
	{
		super(s,f);
		if(face>9) {val = 10;}
		else if(face==1) {val = 11;}
		else {val = face;}
	}
	
	public int getValue()
	{
		return val;
	}
}
