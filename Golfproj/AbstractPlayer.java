import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPlayer {
	private ArrayList<Card> cards;
	private int wins;
	
	public AbstractPlayer()
	{
		cards = new ArrayList<Card>();
	}
	
	public void setWins(int _wins) {wins = _wins;}
	public void setCards(ArrayList<Card> _cards) {cards = _cards;}
	
	public void addCardToHand(Card card) {cards.add(card);}
	public void removeCard(Card card) {cards.remove(card);}
	public void addWin() {wins++;}
	
	public Card getCard(int index) {return cards.get(index);}
	public int getHandSize() {return cards.size();}
	public int getWins() {return wins;}
	
	public void dealCardToIndex(int index, Card card) {cards.add(index, card);}
	
	public int getHandValue()
	{
		int val = 0;
		for (Card card : cards)
		{
			val += card.getValue();
		}
		return val;
	}
	
	public String toString()
	{
		String ans = "";
		ans += "[";
		for (Card card : cards)
		{
			ans += card.toString() + " | value = " + card.getValue() + "\n";
		}
		ans += "] - " + getHandValue();
		return ans;
	}
}
