
import static java.lang.System.*; 
import java.util.Scanner;

public class StringUtilities
{
 	public static boolean endsWith(String a, String b)
 	{
 		try {return a.substring(a.indexOf(b)).equals(b);}
 		catch (Exception e) {return false;}	
	}
}
