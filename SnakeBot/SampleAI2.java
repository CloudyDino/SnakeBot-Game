import java.awt.Point;
import java.util.ArrayList;

public class SampleAI2 extends AI {
    
    private static final String name = "Sample2";
    private static final int mySnake = 2;
    private static final int other = 1;
    
    public String getName() {
        return name;
    }
    
    public char getDirection() {
        Point yum = Game.board.getFood();
        Point head = Game.board.getSnake(mySnake).get(0);
        if (head.getY() > yum.getY()) {
            return 'D';
        }
        else if (head.getX() > yum.getX()) {
            return 'L';
        }
        else if (head.getY() < yum.getY()) {
            return 'U';
        }
        return 'R';
    }
}
