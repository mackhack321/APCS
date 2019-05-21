
//write a method using indexOf and substring
//you will also use if statements

import static java.lang.System.*;

public class Chunk
{
	/*
	 *method getFirstChunk() should return
	 *all letters up to the first @ sign
	 *if there is no @ return "aplus"
	 *if the string starts with an @, return "APLUS"
	 */
	public static String getFirstChunk( String line )
	{
		if( line.indexOf("@") == 0 )
			return "APLUS";
		if( line.indexOf("@") == -1 )
			return "aplus";
		return line.substring(0,line.indexOf("@"));
	}

   public static void main( String args[] )
   {
		System.out.println( getFirstChunk("elephants@are@big") );    //outs elephants
		System.out.println( getFirstChunk("computer@science") );    //outs computer
		System.out.println( getFirstChunk("dogs@are@smarte@than@cats") );   //outs dogs
		System.out.println( getFirstChunk("chickens@are@kewl") );   //outs chickens
		System.out.println( getFirstChunk("dogscats") );   			//outs aplus
		System.out.println( getFirstChunk("funny@@@") );   		//outs funny
		System.out.println( getFirstChunk("@@@@funny@@@") );   		//outs APLUS		
   }
}