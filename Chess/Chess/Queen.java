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
         if(isCollision(x,y,b))
        {
            return false;
        }
        Piece nextPiece = b.getPiece(x, y);
        if((playersTurn > 0 && pieceValue > 0) || 
            (playersTurn < 0 && pieceValue < 0))
        {
            int xDiff = (xPos - x);
            int yDiff = (yPos - y);
            if ((x == xPos && y >= 0 && y < 8) || 
                (y == yPos && x >= 0 && x < 8) ||
                (xDiff * xDiff) == (yDiff * yDiff)){
                return canTake(x,y,b);
            }
        
            if (pieceValue == -1 && x == xPos && y == yPos-1){
                return canTake(x,y,b);
            }
        
        }
        //response in boolean
        return false;
    }
    
    public boolean isCollision(int x, int y, Board b){
        if (x == xPos){ 
            int incDec = 1;
            if(y < yPos){ incDec = -1;}
            for (int ySearch = yPos + incDec; ySearch > y ; ySearch+=incDec){ 
                if(b.getPiece(x, ySearch).getPieceValue() != 0){
                    return true;
                }
            }
        }
        if (y == yPos){ 
            int incDec = 1;
            if(x < xPos){ incDec = -1;}
            for (int xSearch = xPos + incDec; xSearch > x ; xSearch+=incDec){ 
                if(b.getPiece(y, xSearch).getPieceValue() != 0){
                    return true;
                }
            }
        }
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