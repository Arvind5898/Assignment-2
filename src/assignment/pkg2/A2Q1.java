/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author debia7331
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Making a city 
        City kw = new City();
        
        //Creating new Things 
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);
        
        //Making a robot 
        Robot bob = new Robot(kw, 1, 1, Direction.EAST);
        
        //Making bob step onto path 
        bob.move();
        
        //
        while(bob.countThingsInBackpack()!=7){
            bob.pickThing();
            bob.move(); 
            
        if(bob.countThingsInBackpack()==7){
            bob.move();
            bob.move();
            bob.move();
        }
        
        
        
        }
        
    }
}
