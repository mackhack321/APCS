import java.util.List;
import java.util.Arrays;

public class biggestword
{
    public static String biggestWord(String sentence)
    {
        List<String> words = Arrays.asList(sentence.split(" "));
        String biggest = "";
        for (int i = 0; i < words.size(); i++)
        {
            if (words.get(i).length() > biggest.length()) {biggest = words.get(i);}
        }
        return biggest;
    }
    public static void main(String[] args) {
        System.out.println(biggestWord("hello, world!"));
    }
}