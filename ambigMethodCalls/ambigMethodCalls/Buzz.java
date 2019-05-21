package ambigMethodCalls;

public class Buzz {
	public Buzz()
	{
		System.out.println("made new Buzz");
	}
	
	public String buzz()
	{
		return "Buzz buzz!";
	}
	
	public String thing()
	{
		return "did thing from Buzz";
	}
}
