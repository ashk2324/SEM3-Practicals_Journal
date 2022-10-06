import ch.aplu.robotsim.*

        
//        Square
        

public class RobotMove {
    RobotMove()
    {
        TurtleRobot t = new TurtleRobot();
        while(true){
            t.forward(100);
            t.right(90);
        }
        
    }
    public static void main(String []args){
        new RobotMove();
}
}

