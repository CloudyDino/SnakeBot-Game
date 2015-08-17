public class Game {
    
    public static final AI FIRST = new /*Finish this with class of Player 1 AI*/;
    public static final AI SECCOND = new /*Finish this with class of Player 1 AI*/;
    private static final int LENGTH_OF_BOARD = 15;
    private static final int HEIGHT_OF_BOARD = 15;
    private static final int POINTS_TO_WIN = 10;
    public static final SnakeBoard board =
        new SnakeBoard(LENGTH_OF_BOARD, HEIGHT_OF_BOARD, POINTS_TO_WIN, FIRST, SECCOND);
    
    public static void main(String[] args) {
        board.run();
    }
}
