//� A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
      out.println("********************");
   }

   public void printTwentyDashes()
   {
      out.println("--------------------");
   }
   
   public void printTenStars()
   {
      out.println("**********"); 
   }

   public void printTenDashes()
   {
      out.println("----------");
   }
   
   public void printTwoBlankLines()
   {
      out.println("\n");
   }
   
   public void printASmallBox()
   {
	  for (int i = 0; i < 5; i++)
	  {
		  printTenStars();
	      printTenDashes();
	  }    
   }
 
   public void printABigBox()
   { 
      for (int i = 0; i < 10; i++)
      {
    	  printTwentyStars();
    	  printTwentyDashes();
      }
   }   
}