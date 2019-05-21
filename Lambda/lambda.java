
public class lambda {

	public interface Greeter{
		String greetme(String name);
	}
	
	public interface SayBye{
		String saybye(String name);
	}
	
	public static void main(String[] args) {
		Greeter sayhi = (name) -> "Hello, "+name;
		SayBye bye = (name) -> "Goodbye, "+name;
		System.out.println(sayhi.greetme("Mack"));
		System.out.println(sayhi.greetme("Tommy"));
		System.out.println(bye.saybye("Mack"));
	}

}
