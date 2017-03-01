/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author debia7331
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Makinga new city 
        City kw = new City();
        
        //Making a robot 
        Robot bob = new Robot(kw, 2, 1, Direction.EAST);
        
        //making a new thing
        new Thing(kw, 2, 9);
        
        
        //Making and placing the hurdles for the race 
        new Wall(kw, 2, 1, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 2, 7, Direction.EAST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.SOUTH);
        new Wall(kw, 2, 7, Direction.SOUTH);
        new Wall(kw, 2, 8, Direction.SOUTH);
        new Wall(kw, 2, 9, Direction.SOUTH);
        
        //Creating a loop
        while(!(bob.canPickThing())){
       
        //If there is a wall
        if(!(bob.frontIsClear())) {
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        
        } else if(bob.frontIsClear()){
        bob.move();
        
        
        
    }
    
        
        
        
        
        
        }    
        
                
        
        
    }
}
