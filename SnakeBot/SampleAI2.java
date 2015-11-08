import java.awt.Point;
import java.util.ArrayList;

public class SampleAI2 extends AI {
    
    private static final String NAME = "Sample2";

    public SampleAI2(int i) {
        super(i);}
    public String getName() {
        return NAME;}
    
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
