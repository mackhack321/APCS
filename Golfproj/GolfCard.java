
public class GolfCard extends Card
{
  	//constructors
	public GolfCard()
	{
		super("SPADES",1);
	}
	
	public GolfCard(int face, String suit)
	{
		super(suit,face);
	}
	
  	public int getValue()
  	{
  		//Aces are 1, Jacks are 0, King is 10, Queen is 10, and all others are face value
  		if (this.getFace().equals("ACE")) {return 0;}
  		if (this.getFace().equals("JACK")) {return 1;}
  		if (this.getFace().equals("KING") || this.getFace().equals("QUEEN")) {return 10;}
  	
  		String face = this.getFace();
  		for (int i = 0; i < Card.FACES.length; i++)
  		{
  			if (Card.FACES[i].equals(face)) {return i;}
  		}
  		return 9999;
  	}  	
 }
