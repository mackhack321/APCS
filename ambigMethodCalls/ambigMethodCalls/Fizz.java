package ambigMethodCalls;

public class Fizz extends Buzz{
	public Fizz()
	{
		System.out.println("made new Fizz");
	}
	
	public String fizz()
	{
		return "Fizzzz!";
	}
	
	public String thing()
	{
		return "did thing from Fizz";
	}
}
