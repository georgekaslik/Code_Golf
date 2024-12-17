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

     @Override public boolean canMove(int x, int y)
    {
        //can the piece move to x,y?
        
        if ((x == xPos && (y == yPos+1 || y == yPos-1)) || //up and down
            (y == yPos && (x == xPos+1 || x == xPos-1)) || //left and right
            (x == xPos+1 && y == yPos+1) || //top right
            (x == xPos-1 && y == yPos+1) || //top left
            (x == xPos-1 && y == yPos-1) || //bottom left
            (x == xPos+1 && y == yPos-1) //bottom right
            ){
            return true;
        }
        return false;
    }
}