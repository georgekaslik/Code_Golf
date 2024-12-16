
/**
 * Write a description of class Pawn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pawn extends Piece
{
    /**
     * Constructor for objects of class Pawn
     */
    public Pawn(int x, int y, int pieceValue)
    {
        super(x,y,pieceValue);
        if(pieceValue > 0) //white
            this.pieceIcon = 0x2659;
        else
            this.pieceIcon = 0x265F;
    }

    @Override public boolean canMove(int x, int y)
    {
        //can the piece move to x,y?
        
        if (pieceValue == 1 && x == xPos && y == yPos+1){
            return true;
        }
        
        if (pieceValue == -1 && x == xPos && y == yPos-1){
            return true;
        }
        //require a if statment for the direction its moving
        
        //response in boolean
        return false;
    }
}
