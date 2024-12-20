
/**
 * Write a description of class Controler here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Controler
{
    // instance variables - replace the example below with your own
    private int x;
    private Board board;
    private int playersTurn;
    /**
     * Constructor for objects of class Controler
     */
    public Controler()
    { 
        this.board = new Board(8,8);
        this.playersTurn = 1;
    }
    
    public void run()
    {
        while(true)
        {
            board.print();
            getMove();
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void getMove()
    {
        // ask user for move e.g. xurrent xy -> new xy
        Scanner in = new Scanner(System.in);
        
        if(playersTurn > 0)
        {   
            System.out.print("White ");
        }
        else 
        {
            System.out.print("Black ");
        }
        System.out.print("Enter x,y to move: ");
        String s = in.nextLine(); // nextLine means enter
        if(s.equals('q'))
        {
            System.exit(0);
        }
        String[] stringSplit = s.split(",");
        int xCurrent = (stringSplit[0].charAt(0)) - 'A';
        int yCurrent = Integer.parseInt(stringSplit[1]) - 1;
        
        System.out.print("Enter x,y to move to: ");
        s = in.nextLine();
    
        stringSplit = s.split(",");
        int x = (stringSplit[0].charAt(0)) - 'A';
        int y = Integer.parseInt(stringSplit[1]) - 1;
        
        if (xCurrent > 8 || xCurrent < 0 || 
            yCurrent > 8 || yCurrent < 0 || 
            x > 8 || x < 0 || y > 8 ||x < 0)
        {
            return;
        }
        
        Piece piece = this.board.getPiece(xCurrent, yCurrent);
        
        if(piece.canMove(x, y, playersTurn, board))
        {
            this.board.movePiece(xCurrent, yCurrent ,x,y);  
            playersTurn *= -1;
        }
    }
}
