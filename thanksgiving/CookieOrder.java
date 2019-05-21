
public class CookieOrder {
	private String variety;
	private int numBoxes;
	
	public CookieOrder(String _variety, int _numBoxes)
	{
		variety = _variety;
		numBoxes = _numBoxes;
	}
	
	public String getVariety()
	{
		return variety;
	}
	
	public int getNumBoxes()
	{
		return numBoxes;
	}
}
