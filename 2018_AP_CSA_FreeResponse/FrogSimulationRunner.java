public class FrogSimulationRunner 
{
	public static void main(String[] args) 
	{
	  FrogSimulation one = new FrogSimulation( 24, 5 );
	  System.out.println( one.simulate() );
	  System.out.println( one.simulate() );
	  System.out.println( one.simulate() );
	  System.out.println( one.simulate() );	  	  	  
	  System.out.println( one.runSimulations( 400 ) );	  
	}
}
