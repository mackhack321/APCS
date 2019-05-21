//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -



public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		setChar('a');
	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		return Character.isUpperCase(getChar());
	}

	public boolean isLower( )
	{
		return Character.isLowerCase(getChar());
	}
	
	public boolean isNumber( )
	{
		return Character.isDigit(getChar());
	}	

	public int getASCII( )
	{
		return (int)getChar();
	}

	public String toString()
	{
		if (isNumber()) {return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";} 
		else {return ""+getChar() + " is a " + (Character.isUpperCase(getChar()) ? "uppercase":"lowercase") + " character. ASCII == " + getASCII() + "\n";}  
	}
}