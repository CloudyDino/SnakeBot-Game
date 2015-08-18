import java.awt.Point;
import java.util.ArrayList;

public class SampleAI extends AI {
    
    private static final String name = "Sample";
    private static final int mySnake = 1;
    private static final int other = 2;
    
    public String getName() {
        return name;
    }
    
    public char getDirection() {
        Point yum = Game.board.getFood();
        Point head = Game.board.getSnake(mySnake).get(0);
        if (head.getX() > yum.getX()) {
            return 'L';
        }
        else if (head.getX() < yum.getX()) {
            return 'R';
        }
        else if (head.getY() > yum.getY()) {
            return 'D';
        }
        return 'U';
    }
}
