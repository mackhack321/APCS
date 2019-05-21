import java.util.ArrayList;
import java.util.List;

public class MasterOrder {
	private List<CookieOrder> orders;
	
	public MasterOrder()
	{
		orders = new ArrayList<CookieOrder>();
	}
	
	public void addOrder(CookieOrder theOrder)
	{
		orders.add(theOrder);
	}
	
	public int getTotalBoxes()
	{
		int count = 0;
		for (CookieOrder order : orders)
		{
			count += order.getNumBoxes();
		}
		return count;
	}
	
	public int removeVariety(String cookieVar)
	{
		int count = 0;
		for (CookieOrder order : orders)
		{
			if (order.getVariety()==cookieVar) {orders.remove(order); count++;}			
		}
		return count;
	}
}
