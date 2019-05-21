

public abstract class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

  	public Card(String suit, int face)
  	{
  		this.suit = suit;
  		this.face = face;
  	}

	// modifiers
  	
  	public void setFace(int newface)
  	{
  		this.face = newface;
  	}
  	
  	//accessors

  	public String getSuit()
  	{
  		return this.suit;  		
  	}

  	public String getFace()
  	{
  		return FACES[this.face];
  	}

  	public abstract int getValue();

	public boolean equals(Object obj)
	{
		return (this.getFace().equals(((Card) obj).getFace()) && this.getSuit().equals(((Card) obj).getSuit()));
	}

  	public String toString()
  	{
  		return this.getFace()+" of "+this.getSuit();
  	}
  	
 }
