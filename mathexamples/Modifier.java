//modifier method example

import static java.lang.System.*;

class Sum
{
   private int one, two;
   private int total;

   public void setNums( int n1, int n2 )
   {
      one=n1;
      two=n2;
   }

   public void add()
   {
      total = one + two;
   }

   public void print()
   {
      System.out.println(total);
   }
}

public class Modifier
{
   public static void main(String args[])
   {
      Sum test = new Sum();

      //comment this line and rerun the program
      test.setNums(4,9);

      test.add();
      test.print();

      test.setNums(45,92);

      test.add();
      test.print();
   }
}
