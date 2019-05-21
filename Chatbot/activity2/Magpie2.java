/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		// the placement of the conditionals is how you prioritize the responses
		String response = "";
		if (statement.trim().length()<1)
		{
			response = "C'mon, say something";
		}
		// this throws a false positive if mother is anywhere in your word
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog")>=0 || statement.indexOf("cat")>=0)
		{
			response = "Tell me more about your pets.  Or don't.  I don't really care.";
		}
		else if (statement.indexOf("greene")>=0)
		{
			response = "He's the real deal.";
		}
		else if (statement.indexOf("javascript")>=0)
		{
			response = "Get out.";
		}
		else if (statement.indexOf("big data")>=0)
		{
			response = "BIG DATA IN THE CLOUD ON THE DARK WEB.";
		}
		else if (statement.indexOf("help me")>=0)
		{
			response = "Help is on the way.";
		}
		// this throws a false positive if no is anywhere in your word
		if (statement.indexOf(" no ") >= 0)
		{
			response = "Why so negative?";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Wooooow.";
		}
		else if (whichResponse == 5)
		{
			response = "What a story.";
		}

		return response;
	}
}
