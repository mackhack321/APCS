package todolist;

import java.util.ArrayList;

public class ListContainer {
	// instance variables
	
	ArrayList<Item> items = new ArrayList<Item>();
	
	// constructor
	
	public ListContainer() {}
	
	// methods
	
	public void addItem(Item i)
	{
		items.add(i);
		System.out.println("Item added!");
	}
	
	public void delItem(int id)
	{
		for (int i = 0; i < items.size(); i++)
		{
			if (items.get(i).getId() == id)
			{
				items.remove(items.get(i));
			}
		}
		System.out.println("Item removed!");
	}
	
	public String showAllWithOwner(String o)
	{
		String out = "";
		for (int i = 0; i < items.size(); i++)
		{
			if (items.get(i).getOwner() == o)
			{
				out += items.get(i).toString() + "\n";
			}			
		}
		return out;
	}
	
	public Object[][] buildArray()
	{
		Object[][] arr = new Object[items.size()][4];
		for (int i = 0; i < items.size(); i++)
		{
			arr[i] = items.get(i).getArray();
		}
		return arr;
	}
	
	// toString override
	
	public String toString()
	{
		String out = "";
		for (int i = 0; i < items.size(); i++)
		{
			out += items.get(i).toString() + "\n";
		}
		return out;
	}
}
