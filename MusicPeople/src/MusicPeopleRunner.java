import java.util.Arrays;
import java.util.List;

public class MusicPeopleRunner {

	public static void main(String[] args) {
		System.out.println("The user interface to this program is a paid content add-on that has yet to be released.");
		System.out.println("This program will now run in demo mode.\n==========================\n");
		
		System.out.println("Making a musician named Bob, who is a 34 year old male in the punk rock genre...");
		Musician bob = new Musician("Bob", "m", 34, "heavy metal");
		System.out.println(bob);
		
		System.out.println("Bob is born.  What you just saw is his toString().  Now, let's give him a song titled 'Everything is Dead'...");
		bob.addSong("Everything is Dead");
		System.out.println("Let's see his toString() again:");
		System.out.println(bob);
		
		System.out.println("Look at that, there's the song.  Let's add some more just for demonstrative purposes.");
		bob.addSong("I Hate Life");
		bob.addSong("Kill Me Please");
		bob.addSong("The Gambler (Cover)");
		System.out.println(bob);
		
		System.out.println("And now, an unrelated list of all even numbers from 0 up to and including 10:");
		System.out.println(List.of(0,2,4,6,8,10));
		System.out.println("That's not an ArrayList, by the way...\n");
		
		System.out.println("Here's an array with the same numbers in it:");
		System.out.println(Arrays.toString(new int[] {0,2,4,6,8,10}));
		
		System.out.println("\n==========================\nThis concludes the 'interactive' experience.  Goodbye.");
	}

}
