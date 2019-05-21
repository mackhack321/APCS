//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

    String suit;
    int face;

  	public Card(String suit, int face)
  	{
  		this.suit = suit;
  		this.face = face;
  	}

  	public String getSuit()
  	{
  		return this.suit;  		
  	}
  	
  	public String getFace()
  	{
  		return FACES[this.face];
  	}
  	
  	public void setFace(int newface)
  	{
  		this.face = newface;
  	}

  	public String toString()
  	{
  		return this.getFace()+" of "+this.getSuit();
  	}
 }