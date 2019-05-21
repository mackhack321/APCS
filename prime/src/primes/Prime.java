package primes;

public class Prime {

	public static boolean isPrime(int num)
	{
		if (num == 1) {return false;}
		for (double i = 1.0; i < 9.0; i++)
		{
			if (num % i == 0 && i != num && i != 1)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(49));
	}

}
