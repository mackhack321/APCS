
public class Monster {
	
	// instance variables
	
	private String name;
	private int howBig;
	
	// constructors
	
	public Monster()
	{
		name = "Bob"; howBig = 0;
	}
	
	public Monster(String n, int size)
	{
		name = n; howBig = size;
	}
	
	// access methods
	
	public String getName() {return name;}
	public int getHowBig() {return howBig;}
	
	// mutator methods
	
	public void setName(String n) {name = n;}
	public void setHowBig(int s) {howBig = s;}
	
	// evaluation methods
	
	public boolean isBigger(Monster other)
	{
		String ans = howBig>other.getHowBig() ? "is bigger":"is not bigger";
		switch (ans)
		{
		case "is bigger": return true;
		case "is not bigger": return false;
		default: return false;
		}
	}
	
	public boolean isSmaller(Monster other)
	{
		String ans = howBig<other.getHowBig() ? "is smaller":"is not smaller";
		switch (ans)
		{
		case "is smaller": return true;
		case "is not smaller": return false;
		default: return false;
		}
	}
	
	// toString override
	
	public String toString() {return "My name is "+name+" and I have a size of "+howBig;}
}
