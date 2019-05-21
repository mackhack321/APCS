
import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck ()
	{
		stackOfCards = new ArrayList<Card>();
		for (String suit : SUITS)
		{
			for (int face = 1; face < 14; face ++)
			{
				stackOfCards.add(new GolfCard(face,suit));
			}
		}
		topCardIndex = stackOfCards.size();
		
	}

	//modifiers
   public void shuffle ()
	{
	    Collections.shuffle(stackOfCards);
	    topCardIndex = stackOfCards.size();
	}

   //accessors
	public int size()
	{
		return stackOfCards.size() - 1;
	}

	public int numCardsLeft()
	{
		return topCardIndex;
	}

	public Card nextCard()
	{;
		Card toReturn = stackOfCards.get(topCardIndex-1);
		topCardIndex--;
		return toReturn;
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}
