public class Queen extends Piece
{

    /**
     * Constructor for objects of class Queen
     */
    public Queen(int x, int y, int pieceValue)
    {
        super(x,y,pieceValue);
        if(pieceValue > 0) //white
            this.pieceIcon = 0x2655;
        else
            this.pieceIcon = 0x265B;
    }

     @Override public boolean canMove(int x, int y, int playersTurn, Board b)
    {
        //can the piece move to x,y?
        Piece nextPiece = b.getPiece(x, y);
        if((playersTurn > 0 && pieceValue > 0) || 
            (playersTurn < 0 && pieceValue < 0))
        {
            int xDiff = (xPos - x);
            int yDiff = (yPos - y);
            if ((x == xPos && y >= 0 && y < 8) || 
                (y == yPos && x >= 0 && x < 8) ||
                (xDiff * xDiff) == (yDiff * yDiff)){
                return true;
            }
        
            if (pieceValue == -1 && x == xPos && y == yPos-1){
                return true;
            }
        
        }
        //response in boolean
        return false;
    }
}