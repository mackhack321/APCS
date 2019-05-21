

public class HistogramRunner
{
	public static void main(String args[])
	{
		Histogram foo = new Histogram(new int[] {1,5,3,4,5,5,5,4,3,2,5,5,5,3});
		System.out.println(foo+"\n");
		foo.setArr(new int[]{2,3,4,5,6,7,8,9,0,2,3,5,6,8,8,8,9,4,5});
		System.out.println(foo+"\n");
		foo.setArr(new int[]{7,7,7,7,7,7,7,7,5,6,7,8,2,0,2,3,5,1,2,3,4,5,6,5});
		System.out.println(foo);
	}
}