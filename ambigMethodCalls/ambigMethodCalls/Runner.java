package ambigMethodCalls;

public class Runner {

	public static void main(String[] args) {
		Buzz hey = new Fizz();
		System.out.println(hey.buzz());
		System.out.println(((Fizz) hey).fizz());
		System.out.println(hey.thing());
		System.out.println(((Buzz) hey).thing());
	}
}
