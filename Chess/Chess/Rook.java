
/**
 * Write a description of class Rook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rook extends Piece
{

    /**
     * Constructor for objects of class Rook
     */
    public Rook(int x, int y, int pieceValue)
    {
        super(x,y,pieceValue);
        if(pieceValue > 0) //white
            this.pieceIcon = 0x2656;
        else
            this.pieceIcon = 0x265C;
    }

     @Override public boolean canMove(int x, int y)
    {
        //can the piece move to x,y?
        
        if ((x == xPos && y >= 0 && y < 8) || (y == yPos && x >= 0 && x < 8)){
            return true;
        }
        return false;
    }
}
