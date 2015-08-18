import java.awt.Point;
import java.util.List;
import java.util.ArrayList;

public class SnakeBoard {
    private static List<Point> player1, player2;
    private static Point food;
    private static int length, height;
    private static int pointsToWin;
    private static AI ai1, ai2;
    
    // Board Constructor
    public SnakeBoard(int l, int h, int points, AI first, AI seccond) {
        length = l;
        height = h;
        pointsToWin = points;
        player1 = new ArrayList<Point>();
        player2 = new ArrayList<Point>();
        player1.add(new Point(1,1));
        player2.add(new Point(length-1, height-1));
        ai1 = first;
        ai2 = seccond;
        food = newFoodPoint();
    }
    
    // Once this is run, game will keep going until it stops
    public void run() {
        System.out.println("Player1:"+ player1 +" Player2:"+ player2 +" Food:"+ food);
        while(true) {
            // Player 1 Turn
            move(player1, ai1.getDirection());
            if (!isAlive(player1,1)) {
                break;
            }
            endMove(player1,1);
            if (player1.size() >= pointsToWin) {
                winner(ai1, "he or she got 10 points.");
                break;
            }
            System.out.println("Player1:"+ player1);
            
            // Player 2 Turn
            move(player2, ai2.getDirection());
            if (!isAlive(player2,2)) {
                break;
            }
            endMove(player2,2);
            if (player2.size() >= pointsToWin) {
                winner(ai2, "he or she got 10 points.");
                break;
            }
            System.out.println("Player2:"+ player2);
        }
    }
    
    private void move(List<Point> player, char direction) {
        Point pHead = new Point((int)player.get(0).getX(), (int)player.get(0).getY());
        switch (direction) {
            case 'U':
                pHead.translate(0,1);
            case 'D':
                pHead.translate(0,-1);
            case 'L':
                pHead.translate(-1,0);
            case 'R':
                pHead.translate(1,0);
            default:
                pHead.setLocation(-1,-1);
        }
        player.add(0, pHead);
    }
    
    private boolean isAlive(List<Point> player, int p) {
        Point pHead = new Point((int)player.get(0).getX(), (int)player.get(0).getY());
        int pX = (int) pHead.getX();
        int pY = (int) pHead.getY();
        if (pX==0 || pY==0 || pX==length || pY==height) {
            winner((p==2)?ai1:ai2, "opponent ran into a wall.");
            return false;
        }
        else if (player.subList(0, player.size()).contains(pHead)) {
            winner((p==2)?ai1:ai2, "opponent tried to eat himself.");
        }
        else if (player1.get(0).equals(player2.get(0))) {
            winner((p==2)?ai1:ai2, "opponent tried to eat his or her head.");
            return false;
        }
        return true;
    }
    
    private void endMove(List<Point> player, int p) {
        Point pHead = new Point((int)player.get(0).getX(), (int)player.get(0).getY());
        if (pHead.equals(food)) {
            food = newFoodPoint();
            System.out.println("Food:"+food);
        }
        else if (p==1 && player2.contains(pHead)) {
            player2.subList(player2.indexOf(pHead), player2.size()).clear();
        }
        else if (p==2 && player1.contains(pHead)) {
            player1.subList(player1.indexOf(pHead), player1.size()).clear();
        }
        else {
            player.remove(player.size()-1);
        }
    }
    
    private void winner(AI player, String reason) {
        System.out.println(player.getName() + " won because " + reason);
    }
    
    private Point newFoodPoint() {
        Point romb = new Point(0,0);
        while(
            romb.getX()<=0 || romb.getX()>=length || romb.getY()<=0 || romb.getY()>=height
            || player1.contains(romb) || player2.contains(romb) ) {
                romb.setLocation((int) (Math.random()*(length-1) + 1), (int) (Math.random()*(height-1) + 1));
        }
        return romb;
    }
    
    // Use to get an List of Points for player #p
    public List<Point> getSnake(int p) {
        if (p==1) {return player1;}
        else if (p==2) {return player2;}
        else {return null;}
    }
    
    // Use to get Point of food
    public Point getFood() {
        return food;
    }
    
    // Use to get the length of the board
    public int getLength() {
        return length;
    }
    
    // Use to get the height of the board
    public int getHeight() {
        return height;
    }
}
