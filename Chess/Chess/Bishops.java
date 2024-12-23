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

     @Override public boolean canMove(int x, int y, int playersTurn, Board b)
    {
         if(isCollision(x,y,b))
        {
            return false;
        }
        Piece nextPiece = b.getPiece(x, y);
        if((playersTurn > 0 && pieceValue > 0) || 
            (playersTurn < 0 && pieceValue < 0))
        {
            //can the piece move to x,y?
            //(xPos - x)^2 == (yPos - y)^2
            int xDiff = (xPos - x);
            int yDiff = (yPos - y);
            if ((xDiff * xDiff) == (yDiff * yDiff)){
                return canTake(x,y,b);
            }
        }
        return false;
    }
    public boolean isCollision(int x, int y, Board b) {
        if ((x - xPos) == (y - yPos)) {
            int xIncDec = (x > xPos ? 1 : -1);
            int yIntDec = (y > yPos ? 1 : -1);
            int xSearch = xPos;
            int ySearch = yPos;
            while (xSearch != x && ySearch != y) 
            {
                xSearch += xIncDec;
                ySearch += yIntDec;
                if (b.getPiece(xSearch, ySearch).getPieceValue() != 0) {
                    return true;
                }
            }
        }  
        return false;
    }
}