//parameter example 1

public class FunRunner
{
   public static void main(String args[])
   {
   	//option 1 - call static methods directly on the class name
		System.out.println( ParametersOne.times(6,7) );
		System.out.println( ParametersOne.times(3,11) );
		System.out.println( ParametersOne.times(4,2) );
		System.out.println( ParametersOne.times(41,21) );
		
		//option 2 - instantiate an object and call methods on the reference
		ParametersOne x = new ParametersOne();
		System.out.println( x.times( 3, 4) );
   }
}
