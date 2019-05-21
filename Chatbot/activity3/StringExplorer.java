/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		// indexof returns -1 if there is no index
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		if (position != -1)
		{System.out.println ("sample.indexOf(\"quick\") = " + position);}
		else {System.out.println("quick is not found!");}
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		System.out.println("Index of 'foo' in foobar with no parameters: "+"foobar".indexOf("foo"));
		System.out.println("The same thing but with a 1 passed as the extra parameter: "+"foobar".indexOf("foo",1));
	}

}
