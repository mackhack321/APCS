//scope and instance variable example

public class InstanceVars
{
   private int one = 8, two = 3;   	//instance variables
   private int answer;	            //exist throughout the class

   public void add()
   {
      answer = one + two;
   }
   
   public void sub()
   {
	  answer = one-two;
   }
   
   public void div()
   {
	  answer = one/two;
   }
   
   public void mult()
   {
	  answer = one*two;
   }

   public void print()
   {
      System.out.println(answer);
   }

   public static void main(String args[])
   {
      InstanceVars test = new InstanceVars();
      test.add();
      test.print();
      
      test.sub(); test.print();
      test.div(); test.print();
      test.mult(); test.print();
   }
}
