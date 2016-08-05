public class Game {
    
    private static final AI FIRST = new SampleAI1(1); // Replace constructor with Player1's AI
    private static final AI SECCOND = new SampleAI2(2); // Replace constructor with Player2's AI
    private static final int LENGTH_OF_BOARD = 15;
    private static final int HEIGHT_OF_BOARD = 15;
    private static final int POINTS_TO_WIN = 10;
    public static final SnakeBoard board =
        new SnakeBoard(LENGTH_OF_BOARD, HEIGHT_OF_BOARD, POINTS_TO_WIN, FIRST, SECCOND);
    
    public static void main(String[] args) {
        board.run();
    }
}
