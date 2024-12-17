
/**
 * Write a description of class Rook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Horses extends Piece
{

    /**
     * Constructor for objects of class Rook
     */
    public Horses(int x, int y, int pieceValue)
    {
        super(x,y,pieceValue);
        if(pieceValue > 0) //white
            this.pieceIcon = 0x2658;
        else
            this.pieceIcon = 0x265E;
    }

     @Override public boolean canMove(int x, int y)
    {
        //can the piece move to x,y?
        
        if ((x == xPos+1 && y == yPos+2) || // up 2 right 1
            (x == xPos-1 && y == yPos+2) || //up 2 left 1
            (x == xPos-1 && y == yPos-2) || //down 2 left 1
            (x == xPos+1 && y == yPos-2) ||//downe 2 right 1
            (x == xPos+2 && y == yPos+1) || //right 2 up 1
            (x == xPos-2 && y == yPos+1) || //left 2 up 1
            (x == xPos-2 && y == yPos-1) || //left 2 down 1
            (x == xPos+2 && y == yPos-1) //right 2 down 1
            ){
            return true;
        }
        return false;
    }
}
