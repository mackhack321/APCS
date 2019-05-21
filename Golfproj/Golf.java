
import static java.lang.System.*;
import java.util.Scanner;

public class Golf
{
	private Player player1;
	private Player player2;
	private Deck deck;
	private boolean done;

	public Golf()
	{
		player1 = new Player();
		player2 = new Player();
		deck = new Deck();
		deck.shuffle();
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		String choice = "";
		while (!done)
		{
			for (int i = 0; i < 4; i++)
			{
				player1.addCardToHand(deck.nextCard());
				player2.addCardToHand(deck.nextCard());
			}
			System.out.println("PLAYER 1\nHand Value :: "+player1.getHandValue()+"\nHand Size :: "+player1.getHandSize()+"\n\n");
			System.out.println(player1.toString());
			System.out.println("Player 1, which card, 0-3, do you wanna swap?  -1 for none");
			choice = keyboard.nextLine();
			if (!choice.equals("-1"))
			{
				player1.removeCard(player1.getCard(Integer.parseInt(choice)));
				player1.dealCardToIndex(Integer.parseInt(choice), deck.nextCard());
			}
			
			System.out.println(player1.toString());
			System.out.println("Player 1, which card, 0-3, do you wanna swap?  -1 for none");
			choice = keyboard.nextLine();
			if (!choice.equals("-1"))
			{
				player1.removeCard(player1.getCard(Integer.parseInt(choice)));
				player1.dealCardToIndex(Integer.parseInt(choice), deck.nextCard());
			}
			System.out.println(player1.toString());

			// PLAYER 1 ENDS
			System.out.println("\n\nEND PLAYER 1 TURN, ENTER PLAYER 2\n\n");
			// PLAYER 2 STARTS
			
			System.out.println("PLAYER 2\nHand Value :: "+player2.getHandValue()+"\nHand Size :: "+player2.getHandSize()+"\n\n");
			System.out.println(player2.toString());
			System.out.println("Player 2, which card, 0-3, do you wanna swap?  -1 for none");
			choice = keyboard.nextLine();
			if (!choice.equals("-1"))
			{
				player2.removeCard(player2.getCard(Integer.parseInt(choice)));
				player2.dealCardToIndex(Integer.parseInt(choice), deck.nextCard());
			}
			
			System.out.println(player2.toString());
			System.out.println("Player 2, which card, 0-3, do you wanna swap?  -1 for none");
			choice = keyboard.nextLine();
			if (!choice.equals("-1"))
			{
				player2.removeCard(player2.getCard(Integer.parseInt(choice)));
				player2.dealCardToIndex(Integer.parseInt(choice), deck.nextCard());
			}
			System.out.println(player2.toString());
			
			// GAME OVER, FIND WINNER
			
			if (player1.getHandValue() < player2.getHandValue())
			{
				System.out.println("\n\n\nPLAYER 1 WINS\n\n\n");
				player1.addWin();
			}
			
			else if (player1.getHandValue() > player2.getHandValue())
			{
				System.out.println("\n\n\nPLAYER 2 WINS\n\n\n");
				player2.addWin();
			}
			
			else {System.out.println("Draw detected.  Nobody wins.");}
			
			System.out.println("PLAYER 1 HAND VALUE :: "+player1.getHandValue() + "\nPLAYER 2 HAND VALUE :: "+player2.getHandValue());
			System.out.println("\n\nPLAYER 1 WIN COUNT :: "+player1.getWins() + "\nPLAYER 2 WIN COUNT :: "+player2.getWins());
			System.out.println("Play again?  (y/n) :: ");
			choice = keyboard.nextLine();
			if (choice.equals("n")) {done = true;}
		}	
	}
	
	public static void main(String[] args)
	{
		Golf game = new Golf();
		game.playGame();
	}
}
