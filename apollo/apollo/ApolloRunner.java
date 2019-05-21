package apollo;

public class ApolloRunner {

	public static void main(String[] args) {
		Apollo apollo = new Apollo("data");
		System.out.println(apollo.calculate());
	}

}
