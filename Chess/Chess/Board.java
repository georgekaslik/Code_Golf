
/**
 * Write a description of class Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
    // instance variables - replace the example below with your own
    private int xSize;
    private int ySize;
    private Piece[][] board;

    /**
     * Constructor for objects of class Board
     */
    public Board(int x, int y)
    {
        // initialise instance variables
        this.xSize = x;
        this.ySize = y;
        this.board = new Piece[x][y];
        this.populate();
    }
    
    public void populate() {
        for (int y = 0; y < board.length; y++)
        {
            for (int x = 0; x < board[y].length; x++)
            {
                if (y == 1){
                    board[y][x] = new Pawn(x,y, 1);
                    //The last number is the value for the pawns
                }
                else if (y == 6){
                    board[y][x] = new Pawn(x,y, -1);
                }
                else if ((y == 0 && x == 0) || (y == 0 && x ==7)){
                    board[y][x] = new Rook(x,y, 5);
                    //The last number is the value for the pawns
                }
                else if ((y == 7 && x == 0) || (y == 7 && x ==7)){
                    board[y][x] = new Rook(x,y, -5);
                }
                else if ((y == 0 && x == 1) || (y == 0 && x ==6)){
                    board[y][x] = new Horses(x,y, 3);
                    //The last number is the value for the pawns
                }
                else if ((y == 7 && x == 1) || (y == 7 && x ==6)){
                    board[y][x] = new Horses(x,y, -3);
                }
                else if ((y == 0 && x == 2) || (y == 0 && x ==5)){
                    board[y][x] = new Bishops(x,y, 3);
                    //The last number is the value for the pawns
                }
                else if ((y == 7 && x == 2) || (y == 7 && x ==5)){
                    board[y][x] = new Bishops(x,y, -3);
                }
                else if (y == 0 && x == 4){
                    board[y][x] = new Queen(x,y, 9);
                    //The last number is the value for the pawns
                }
                else if (y == 7 && x == 3){
                    board[y][x] = new Queen(x,y, -3);
                }
                
                else if (y == 0 && x == 3){
                    board[y][x] = new King(x,y, 9);
                    //The last number is the value for the pawns
                }
                else if (y == 7 && x == 4){
                    board[y][x] = new King(x,y, -3);
                }
                
                else
                {
                    board[y][x] = new Blank(x,y);
                }
            }
        }
    }
    
    public Piece getPiece(int x, int y)
    {
        return board[y][x];
    }
    
    public void movePiece(int xCurrent, int yCurrent, int xNew, int yNew)
    {
        Piece piece = getPiece(xCurrent, yCurrent);
        board[yCurrent][xCurrent] = new Blank(xCurrent, yCurrent);
        piece.moveTo(xNew, yNew);
        board[yNew][xNew] = piece;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void print()
    {
        System.out.println("BOARD");
        for (int y = 0; y < board.length; y++)
        {
            if(y == 0){
                System.out.print(" ");
                for (int x = 0; x < board[y].length; x++)
                {
                    System.out.print((char)(x+65));
                }
                System.out.print("\n");
            }
            System.out.print(y+1);
            for (int x = 0; x < board[y].length; x++)
            {
                System.out.print(board[y][x].getPiece());
            }
            System.out.print("\n");
        }
    }

}
