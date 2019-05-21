// Welcome to Mack's BetterBot!
// This is a "mod" for Karel.  It adds some functionality you won't find in the original class.

package jmstanley;

import kareltherobot.*;
import java.util.*;

public class BetterBot extends Robot implements Directions
{
    public int beepers; // keep track of beeper count since it's private in the UrRobot class >:(
    
    public BetterBot(int a, int b, Directions.Direction dir, int startbeepers) // constructor
    {
        super(a,b,dir,startbeepers); // super() means it uses the constructor from UrRobot
        beepers=startbeepers;
    }
    
    public void turnRight() // turns left three times
    {
        turnLeft(); turnLeft(); turnLeft();
    }
    
    public void turnAround() // turns you around
    {
        turnLeft(); turnLeft();
    }
    
    public void move(int a) // do move(2); instead of move(); move();, works for any int
    {
        for (int i = 0; i<a; i++)
        {
            move();
        }
    }
    
    public void faceDir(Directions.Direction dir) // turns you around to face given direction
    {
        if(dir==North)
        {
            while(!facingNorth())
            {
                turnLeft();
            }
        }
        
        if(dir==East)
        {
            while(!facingEast())
            {
                turnLeft();
            }
        }
        
        if(dir==South)
        {
            while(!facingSouth())
            {
                turnLeft();
            }
        }
        
        if(dir==West)
        {
            while(!facingWest())
            {
                turnLeft();
            }
        }
    }
    
    public void pathfind(int beepercount) // solves mazes, takes int to specify how many beepers in the maze
    {
        while (this.beepers<beepercount)
        {
            while (!super.nextToABeeper())
            {
                if(frontIsClear())
                {
                    move();
                }
                else{turnLeft();}
                if(rightIsClear())
                {
                    turnRight();
                }
            }
            pickBeeper();
        }
        turnOff();
    }
    
    public boolean rightIsClear() // returns boolean for if there's a wall to your right
    {
        turnRight();
        boolean val = frontIsClear();
        turnLeft();
        return val;
    }
    
    public void pickBeeper() // pick beeper and add 1 to beeper count
    {
        super.pickBeeper();
        this.beepers += 1;
    }
    
    public void putBeeper() // see above, but minus 1
    {
        if (this.beepers>=1)
        {
            super.putBeeper();
            this.beepers -= 1;
        }
        else
        {
            System.out.println("Tried to put beeper with no beepers being held!");
        }
    }
    
    public void printBeepers() // print beeper count to console
    {
        System.out.println(this.beepers);
    }
}
