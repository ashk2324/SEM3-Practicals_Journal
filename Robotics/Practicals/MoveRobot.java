import ch.aplu.robotsim.*


//        Circle
        
        
public class MoveRobot {
    MoveRobot()
    {
        TurtleRobot t = new TurtleRobot();
        while(true){
            t.forward(3);
            t.right(3);
        }
        
    }
    public static void main(String []args){
        new MoveRobot();
}
}