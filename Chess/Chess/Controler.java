
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
    /**
     * Constructor for objects of class Controler
     */
    public Controler()
    { 
        this.board = new Board(8,8);;
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
        
        System.out.print("Enter x,y to move: ");
        String s = in.nextLine();
        if(s.equals('q'))
        {
            System.exit(0);
        }
        String[] stringSplit = s.split(",");
        int xCurrent = Integer.parseInt(stringSplit[0]);
        int yCurrent = Integer.parseInt(stringSplit[1]);
        System.out.println("You entered x=" + xCurrent + " y=" + yCurrent);
        
        System.out.print("Enter x,y to move to: ");
        s = in.nextLine();
    
        stringSplit = s.split(",");
        int x = Integer.parseInt(stringSplit[0]);
        int y = Integer.parseInt(stringSplit[1]);
        System.out.println("You entered x=" + x + " y=" + y);
        
        Piece piece = this.board.getPiece(xCurrent, yCurrent);
        if(piece.canMove(x,y))
        {
            this.board.movePiece(xCurrent, yCurrent ,x,y);       
        }
    }
}
