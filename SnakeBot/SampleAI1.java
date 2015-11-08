import java.awt.Point;
import java.util.ArrayList;

public class SampleAI1 extends AI {
    
    private static final String NAME = "Sample1";
    
    public SampleAI1(int i) {
        super(i);}
    public String getName() {
        return NAME;}
    
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
