import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Game {
	
	private Deck deck;
	private List<Card> playerHand;
	private List<Card> computerHand;
	private List<Integer> playerValues;
	private List<Integer> computerValues;
	
	private final String LAUNCHER = "\n\n1: Show Hands\n2: Hit Me\n3: I'm Staying\n4: Change Ace Value\nEnter your choice :: ";
	private final String SHOW = "1";
	private final String HIT = "2";
	private final String STAY = "3";
	private final String ACE = "4";
	
	private boolean done = false;
	
	Scanner sc;
	
	public Game()
	{
		deck = new Deck();
		playerHand = new ArrayList<Card>();
		computerHand = new ArrayList<Card>();
		
		playerValues = new ArrayList<Integer>();
		computerValues = new ArrayList<Integer>();
		
		sc = new Scanner(System.in);
		
		deck.shuffle();
		initialDeal();
		updateValues();
	}
	
	public void go()
	{
		System.out.println("Welcome to Blackjack!");
		while (!done)
		{
			updateValues();
			System.out.println(LAUNCHER);
			String choice = sc.nextLine();
			if (choice.equals(SHOW))
			{
				showPlayerHand();
				showComputerHand();
			}
			
			if (choice.equals(HIT))
			{
				hitPlayer();
			}
			
			if (choice.equals(STAY))
			{
				computerTurn();
				finish();
			}
			
			if (choice.equals(ACE))
			{
				if (!hasAce()) { System.out.println("\nYou have no aces in your hand!"); continue; }
				changeAce();
			}
		}
	}
	
	public void initialDeal()
	{
		for (int i = 0; i < 2; i++) { playerHand.add(deck.dealCard()); }
		for (int i = 0; i < 2; i++) { computerHand.add(deck.dealCard()); }
	}
	
	public void changeAce()
	{
		for (Card card : playerHand)
		{			
			if (Card.FACES[card.getFace()].equals("ACE"))
			{
				card.setValue((card.getValue() == 1) ? 11 : 1); break;
			}
		}
	}
	
	public void updateValues()
	{
		playerValues.clear(); computerValues.clear();
		for (Card card : playerHand) { playerValues.add(card.getValue()); }
		for (Card card : computerHand) { computerValues.add(card.getValue()); }
	}
	
	public boolean hasAce()
	{
		for (Card card : playerHand)
		{
			if (card.getFace() == 1) { return true; }
		}
		return false;
	}
	
	public int getTotal(List<Integer> values)
	{
		int sum = 0;
		for (int val : values) { sum += val; }
		return sum;
	}
	
	public void hitPlayer()
	{
		playerHand.add(deck.dealCard());
		updateValues();
		showPlayerHand();
		
		if (getTotal(playerValues) > 21)
		{
			System.out.println("\nYou busted, you lose :("); done = true;
		}
	}
	
	public void computerTurn()
	{
		while (getTotal(computerValues) <= 17)
		{
			computerHand.add(deck.dealCard());
			updateValues();
		}
	}
	
	public void showPlayerHand()
	{
		System.out.println("\nYour hand :: ");
		for (Card card : playerHand) { System.out.println(card.toString()); }
		System.out.println("Your total :: " + getTotal(playerValues));
	}
	
	public void showComputerHand()
	{
		System.out.println("\nComputer's hand :: ");
		System.out.println(computerHand.get(0));
		for (int i = 1; i < computerHand.size(); i++) {System.out.println("HIDDEN");}
	}
	
	public void showComputerFullHand()
	{
		System.out.println("\nComputer's hand :: ");
		for (Card card : computerHand) { System.out.println(card.toString()); }
		System.out.println("Computer's total :: " + getTotal(computerValues));
	}
	
	public void finish()
	{
		showPlayerHand();
		showComputerFullHand();
		
		if (getTotal(computerValues) > 21) { System.out.println("Computer busted, you win!!!"); }
		else { System.out.println((getTotal(playerValues) > getTotal(computerValues)) ? "\nYou win!!!" : "\nYou lose :("); }
		
		done = true;
		sc.close();
	}
	
	public String showHandsDebug()
	{
		return "Player Hand :: "+playerHand.toString() + "\nComputer Hand :: "+computerHand.toString();
	}
	
	public String showValuesDebug()
	{
		return "Player Values :: "+playerValues.toString() + "\nComputer Values :: "+computerValues.toString();
	}
}
