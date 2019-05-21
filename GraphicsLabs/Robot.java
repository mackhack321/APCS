//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      head(window);
      upperBody(window);
      lowerBody(window);  
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW); // face
      window.fillOval(300, 100, 200, 100);

      window.setColor(Color.BLACK); // left eye
      window.fillOval(340,120,25,25);

      window.setColor(Color.BLACK); // right eye
      window.fillOval(440,120,25,25);
      
      window.drawArc(350,130,100,50,0,-180); // smile
      
      window.setColor(Color.BLUE);
      window.fillRect(350,200,100,100);
      
      window.setColor(Color.GRAY);
      window.fillRect(350,310,100,100);
      
      window.drawLine(350,200,100,90);
      window.drawLine(450,200,600,90);
      
      window.drawLine(350,400,155,511);
      window.drawLine(450,400,655,511);
   }

   public void upperBody( Graphics window )
   {

		//add more code here
   }

   public void lowerBody( Graphics window )
   {

		//add more code here

   }
   
   public static Point mousepos()
   {
	   PointerInfo b = MouseInfo.getPointerInfo();
	   Point p = b.getLocation();
	   return p;
   }
}