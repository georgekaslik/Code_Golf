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

     @Override public boolean canMove(int x, int y, int playersTurn)
    {
        if((playersTurn > 0 && pieceValue > 0) || 
            (playersTurn < 0 && pieceValue < 0))
        {
            //can the piece move to x,y?
            //(xPos - x)^2 == (yPos - y)^2
            int xDiff = (xPos - x);
            int yDiff = (yPos - y);
            if ((xDiff * xDiff) == (yDiff * yDiff)){
                return true;
            }
        }
        return false;
    }
}