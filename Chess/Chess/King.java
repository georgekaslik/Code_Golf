public class King extends Piece
{

    /**
     * Constructor for objects of class Queen
     */
    public King(int x, int y, int pieceValue)
    {
        super(x,y,pieceValue);
        if(pieceValue > 0) //white
            this.pieceIcon = 0x2654;
        else
            this.pieceIcon = 0x265A;
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
            if ((x == xPos && (y == yPos+1 || y == yPos-1)) || //up and down
                (y == yPos && (x == xPos+1 || x == xPos-1)) || //left and right
                (x == xPos+1 && y == yPos+1) || //top right
                (x == xPos-1 && y == yPos+1) || //top left
                (x == xPos-1 && y == yPos-1) || //bottom left
                (x == xPos+1 && y == yPos-1) //bottom right
                ){
                return canTake(x,y,b);
            }
        }
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
                if(b.getPiece(xSearch, y).getPieceValue() != 0){
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