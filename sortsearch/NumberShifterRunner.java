

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int[] arr = NumberShifter.makeLucky7Array(10);
		System.out.println(Arrays.toString(arr));
		NumberShifter.shiftEm(arr);
	}
}



