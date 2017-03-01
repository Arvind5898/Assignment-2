/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author debia7331
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Making a city 
        City kw = new City();

        //Making a robot 
        Robot bob = new Robot(kw, 6, 6, Direction.EAST);

        //Making bob return to the origin along the x axis
        while ((bob.getAvenue() > 0)) {
            if (!(bob.getDirection() == Direction.WEST)) {
                bob.turnLeft();

            } else if (bob.getDirection() == Direction.WEST) {
                bob.move();
            }
        }
        //Making him return to the origin along the y axis 
        while ((bob.getStreet()> 0)) {
            if (!(bob.getDirection() == Direction.NORTH)) {
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                
            } else if(bob.getDirection() == Direction.NORTH){
                bob.move();
            }
        }





    }
}
