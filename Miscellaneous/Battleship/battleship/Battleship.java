package battleship;

import java.util.Scanner;
import java.util.Random;

public class Battleship {
	private Board human = new Board();
	private Board comp = new Board();
	private Board humanGuessed = new Board();
	private Board compGuessed = new Board();;
	private Scanner sc = new Scanner(System.in);
	private Random rand = new Random();

	public Battleship() {}
	
	public void play()
	{
		System.out.println("Welcome to Battleship...in Java!!!");
		makeCompBoard();
		getHumanShipPositions();
		while (human.amountOfShips()>0 && comp.amountOfShips()>0)
		{
			System.out.println("You have "+human.amountOfShips()+" ships left.  Computer has "+comp.amountOfShips()+" ships left.");
			System.out.print("Show your (b)oard, show your (g)uesses, or take your (t)urn?\n>> ");
			String choice = sc.next().toLowerCase();
			if (choice.equals("b")) {System.out.println("Your Board:"); System.out.println(human);}
			else if (choice.equals("g")) {System.out.println("Your Guesses: "); System.out.println(humanGuessed);}
			else if (choice.equals("t"))
			{
				takeHumanTurn();
				if (comp.amountOfShips()==0) {win();}
				takeCompTurn();
				if (human.amountOfShips()==0) {lose();}
			}
		}
		sc.close();
	}
	
	private void getHumanShipPositions()
	{
		System.out.println("You will now pick the coordinates for your ships.");
		for (int i = 1; i < 6; i++)
		{
			System.out.print("Ship "+i+" column: ");
			int col = sc.nextInt();
			System.out.print("Ship "+i+" row: ");
			int row = sc.nextInt();
			if (human.getVal(row, col) == 1)
			{
				System.out.println("There's already a ship there!");
				i--; continue;
			}
			human.setVal(row, col, 1);
		}
		System.out.println("\n\n\n\n\n");
	}
	
	private void makeCompBoard()
	{
		while (comp.amountOfShips() < 5)
		{
			int row = rand.nextInt(5-1+1)+1;
			int col = rand.nextInt(5-1+1)+1;
			if (comp.getVal(row,col) == 1) {continue;}
			comp.setVal(row, col, 1);
		}
	}
	
	private void takeHumanTurn()
	{
		System.out.println("Where do you want to fire on the computer's board?");
		System.out.print("Target row: ");
		int row = sc.nextInt();
		System.out.print("Target column: ");
		int col = sc.nextInt();
		if (!humanHasGuessed(row,col))
		{
			if (comp.getVal(row, col)==1)
			{
				System.out.println("HIT!!!");
				comp.setVal(row, col, 0);
			}
			else
			{
				System.out.println("Miss...");
			}
			humanGuessed.setVal(row, col, 1);
		}
		else
		{
			System.out.println("You already guessed here!");
			takeHumanTurn();
		}
	}
	
	private void takeCompTurn()
	{
		int row = rand.nextInt(5-1+1)+1;
		int col = rand.nextInt(5-1+1)+1;
		if (!compHasGuessed(row,col))
		{
			if (human.getVal(row, col)==1)
			{
				System.out.println("Computer hit your ship at "+row+","+col+"!");
				human.setVal(row, row, 0);
			}
			else
			{
				System.out.println("Computer fired at "+row+","+col+" and missed.");
			}
			compGuessed.setVal(row, col, 1);;
		}
		else {takeCompTurn();}
	}	
	
	private boolean humanHasGuessed(int row, int col)
	{
		if (humanGuessed.getVal(row, col)==1) {return true;}
		else {return false;}
	}
	
	private boolean compHasGuessed(int row, int col)
	{
		if (compGuessed.getVal(row, col)==1) {return true;}
		else {return false;}
	}
	
	private void win()
	{
		System.out.println("YOU WIN!!!");
		System.out.print("Play again? (y/n): ");
		String choice = sc.next();
		if (choice.equals("y")) {play();}
		else if (choice.equals("n")) {System.out.println("Goodbye."); System.exit(0);}
		else {win();}		
	}
	
	private void lose()
	{
		System.out.println("You lose...");
		System.out.print("Play again? (y/n): ");
		String choice = sc.next();
		if (choice.equals("y")) {play();}
		else if (choice.equals("n")) {System.out.println("Goodbye."); System.exit(0);}
		else {lose();}		
	}
	
	public Board getHumanBoard() {return human;}
	public Board getCompBoard() {return comp;}
}
