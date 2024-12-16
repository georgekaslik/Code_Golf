public class Bishops extends Piece
{

    /**
     * Constructor for objects of class Bishops
     */
    public Bishops(int x, int y, int pieceValue)
    {
        super(x,y,pieceValue);
        if(pieceValue > 0) //white
            this.pieceIcon = 0x2657;
        else
            this.pieceIcon = 0x265D;
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