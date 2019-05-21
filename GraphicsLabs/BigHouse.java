//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.GREEN);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);

      window.fillRect(200, 200, 400, 400 );
      
      window.setColor(Color.RED);
      window.fillRect(325, 375, 150, 300);

      window.setColor(Color.BLACK);
      window.fillRect(100, 100, 600, 100);
      
      window.setColor(Color.YELLOW);
      window.fillRect(250, 250, 100, 100);
      
      window.setColor(Color.YELLOW);
      window.fillRect(450, 250, 100, 100);
   }
}