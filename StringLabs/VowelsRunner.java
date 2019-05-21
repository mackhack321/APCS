
public class VowelsRunner
{
	public static void main( String args[] )
	{
		FirstLastVowel s = new FirstLastVowel();
			
		System.out.println(  s.go(  "dog#cat#pigaplus")    );
		System.out.println(  s.go(  "pigs#apluscompsci#food")    );
		System.out.println(  s.go(  "##catgiraffeapluscompsci")    );
		System.out.println(  s.go(  "apluscatsanddogsaplus###")    );
		System.out.println(  s.go(  "##")    );
		System.out.println(  s.go(  "aplusdog#13337#pigaplusprogram")    );
		System.out.println(  s.go(  "code#H00P#code1234")    );
		System.out.println(  s.go(  "##wowgira77##eplus")    );
		System.out.println(  s.go(  "catsandaplusdogsaplus###")    );
		System.out.println(  s.go(  "7")    );
		System.out.println(  s.go(  "a")    );
		System.out.println(  s.go(  "E")    );
		System.out.println(  s.go(  "9AEIOUaeiou8")    );



	}
}


