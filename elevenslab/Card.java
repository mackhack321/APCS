
public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
	private String suit;
	private int face;
	private int value;

  	//constructors
  	public Card( String s, int f)
  	{
  		suit = s;
  		face = f;
  		value = (f >= 10) ? 10 : f;
  	}

	// modifiers
	public void setFace( int f)
	{
		face = f;
	}

	public void setSuit( String s)
	{
		suit = s;
	}

	public void setValue(int v)
	{
		value = v;
	}
	
  	//accessors
	public String getSuit()
	{
		return suit;
	}

	public int getFace()
	{
		return face;
	}
	
	public int getValue()
	{
		return value;
	}

  	//toString
  	public String toString()
  	{
  		return FACES[face] + " of " + suit;
  	}
 }
