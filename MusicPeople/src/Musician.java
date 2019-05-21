import java.util.List;
import java.util.ArrayList;

public class Musician extends Human {
	private List<Song> songs;
	private String genre;
	
	public Musician(String name, String gender, int age, String genre)
	{
		super(name, gender, age);
		songs = new ArrayList<Song>();
		this.genre = genre;
	}
	
	public List<Song> getSongs() {return songs;}
	public String getGenre() {return genre;}
	
	public void addSong(String title) {songs.add(new Song(title, getName(), this.genre));}
	public void delSong(Song song) {songs.remove(song);}
	public void setGenre(String genre) {this.genre = genre;}
	
	public String toString()
	{
		String ans = super.toString() + "  Also, this musician is a " + genre + " musician and has made these songs:\n";
		for (Song song : songs) {ans += song + "\n";}
		return ans;
	}
}
