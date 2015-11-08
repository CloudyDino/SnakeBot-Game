public abstract class AI {
    
    // to get the ArrayList of your own snake, use Game.board.getSnake(mySnake)
    // to get the ArrayList of your opponent's snake, use Game.board.getSnake(other)
    // to get length of board, use Game.board.getLength()
    // to get height of board, use Game.board.getHeight()
    // to get Point of food, use Game.board.getFood()
    
    protected int mySnake;
    protected int other;
    public AI(int playernum) {
        mySnake = playernum;
        if (mySnake==1) {
            other = 2;
        }
        else{
            other = 1;
        }
    }
    
    // returns your bot's name
    abstract String getName();
    
    // returns one of the following uppercase letters: U, D, L, R
    abstract char getDirection();
}