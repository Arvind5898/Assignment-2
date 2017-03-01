/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author debia7331
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Making a robot
        
        City kw = new City();
        
        // Making a robot 
        
        Robot bob = new Robot(kw, 0, 0, Direction.EAST);
        
        // Creating the castle
        
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.EAST);
        
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.WEST);
        
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.NORTH);
        
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        
        // Creating the loop
        
        while(bob.frontIsClear()){
        
        bob.move();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        }
    }   
}       
