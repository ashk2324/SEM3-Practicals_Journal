/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics;

import ch.aplu.robotsim.*;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class RobotMotorSquare {
    NxtRobot nxtRobot;
    Motor motorLeft, motorRight;

    public RobotMotorSquare() {
        nxtRobot = new NxtRobot();
        motorLeft = new Motor(MotorPort.A);
        motorRight = new Motor(MotorPort.B);
        
        nxtRobot.addPart(motorLeft);
        nxtRobot.addPart(motorRight);
        
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Enter direction: ");
        //String direction = scanInput.nextLine().toLowerCase();
        String direction = "left";
        
        switch(direction){
            case "left":
                squareLeft();
                break;
            
            case "right":
                squareRight();
                break;
             
            default:
                System.out.println("Wrong direction");
                System.exit(1);
        }
    }

    private void squareLeft() {
        while(true){
            motorLeft.forward();
            motorRight.forward();
            
            Tools.delay(1110);
            motorLeft.stop();
            Tools.delay(1115);
        }
    }

    private void squareRight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        new RobotMotorSquare();
    }
    
}
