import kareltherobot.*;
import jmstanley.*;
import java.awt.Color;

public class Testing implements Directions
{
   public static void main(String[] args)
   {
       BetterBot karel = new BetterBot(1,1,East,3);
       BetterBot foo = new BetterBot(2,1,East,3);
       karel.printBeepers(); karel.move(); karel.putBeeper(); karel.move(); karel.printBeepers();
       foo.printBeepers(); foo.move(); foo.putBeeper(); foo.move(); foo.printBeepers();
   }

   static
   {
        World.setVisible(true);
        World.readWorld("blank.kwld");
        World.showSpeedControl(true);
   }
}
