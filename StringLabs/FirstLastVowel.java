import java.util.ArrayList;
import java.util.List;

public class FirstLastVowel
{
   public String go(String a)
   {
	   List<String> vowels = new ArrayList<String>() {{
		   add("a"); add("e"); add("i"); add("o"); add("u");
		   add("A"); add("E"); add("I"); add("O"); add("U");
	   }};
	   return (vowels.contains(String.valueOf(a.charAt(0))) || vowels.contains(String.valueOf(a.charAt(a.length()-1))) ? "yes":"no");
   }
}
