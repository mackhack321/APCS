

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck
{

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;

	public Deck()
	{
		cards = new ArrayList<Card>();
		for (String suit : SUITS)
		{
			for (int face = 1; face < 14; face ++)
			{
				cards.add(new Card(suit,face));
			}
		}
		top = cards.size() - 1;
	}
      
	public Card dealCard()
	{
		Card toDeal = cards.get(top);
		top--;
		return toDeal;
	}
	
    public void shuffle()
    {
	    Collections.shuffle(cards);
	    top = cards.size() - 1;
    }
    
    public String toString()
    {
    	return cards.toString();
    }
}