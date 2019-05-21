
public class CardTestOne
{
	public static void main( String args[] )
	{
		Card one = new GolfCard();
		System.out.println(one);

		Card two = new GolfCard(1,"DIAMONDS");
		System.out.println(two);

		Card three = new GolfCard(4,"CLUBS");
		System.out.println(three);
		
		Card four = new GolfCard(11,"SPADES");
		System.out.println(four);
	
		Card five = new GolfCard(12,"HEARTS");
		System.out.println(five);	
		
		Card six = new GolfCard(9,"SPADES");
		System.out.println(six);				

		System.out.println(one.equals(two));
		System.out.println(one.equals(one));		
		System.out.println(four.equals(five));	
		System.out.println(three.equals(four));						
	}
}
