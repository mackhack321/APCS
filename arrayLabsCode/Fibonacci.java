import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci
{
	private int size;
	private List<Integer> fibarr;
	
	public Fibonacci(int size)
	{
		setSize(size);
		fibarr = new ArrayList<Integer>();
		doFibo();
	}

	public void setSize(int _size)
	{
		size = _size;
	}

	public void doFibo()
	{
		fibarr.clear();
		int count = 0;
		int n1 = 0;
		int n2 = 1;
		int nth;
		while (count < size)
		{
			nth = n1 + n2;
			n1 = n2;
			n2 = nth;
			fibarr.add(n1);
			count++;
		}
		System.out.println(fibarr);
	}
	
	public List<Integer> getList()
	{
		return fibarr;
	}
	
	public String toString()
	{
		return String.valueOf(fibarr);
	}
}