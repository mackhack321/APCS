package battleship;

public class Board {
	private int[][] arr;
	
	public Board()
	{
		arr = new int[5][5];
	}
	
	public int getVal(int r, int c)
	{
		return arr[r-1][c-1];
	}
	
	public void setVal(int r, int c, int val)
	{
		arr[r-1][c-1] = val;
	}

	public int amountOfShips()
	{
		int amt = 0;
		for (int r = 0; r < 5; r++)
		{
			for (int c = 0; c < 5; c++)
			{
				if (arr[r][c] == 1) {amt++;}
			}
		}
		return amt;
	}
	
	public String toString()
	{
		String out = "";
		for (int r = 0; r < 5; r++)
		{
			for (int c = 0; c < 5; c++)
			{
				out += arr[r][c];
			}
			out += "\n";
		}
		return out;
	}

}
