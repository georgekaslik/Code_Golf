
/**
 * Write a description of class Pawn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pawn extends Piece
{
    Boolean firstMove;
    
    /**
     * Constructor for objects of class Pawn
     */
    public Pawn(int x, int y, int pieceValue)
    {
        super(x,y,pieceValue);
        this.firstMove = true;
        if(pieceValue > 0) //white
            this.pieceIcon = 0x2659;
        else
            this.pieceIcon = 0x265F;
    }

    @Override public boolean canMove(int x, int y, int playersTurn, Board b)
    {
        boolean returnVal = false;
        if(isCollision(x,y,b))
        {
            return returnVal;
        }
        Piece nextPiece = b.getPiece(x, y);
        if((playersTurn > 0 && pieceValue > 0) || (playersTurn < 0 && pieceValue < 0))
        {
            int incDec = 1;
            if(pieceValue < 0){ incDec = -1;}
            if (firstMove && x == xPos && y == yPos+(2*incDec)){
                returnVal = canTake(x,y,b);
            }
            if (x == xPos && y == yPos+incDec){
                if(b.getPiece(x, y).getPieceValue() != 0){ 
                    returnVal = false;
                } else {
                    returnVal = canTake(x,y,b);
                }
            }
            else if ((x == xPos+1 || x == xPos-1) && y == yPos+incDec){
                if((b.getPiece(x, y).getPieceValue() > 0 && pieceValue < 0)||
                (b.getPiece(x, y).getPieceValue() < 0 && pieceValue > 0)){
                    returnVal = true;
                }
            }
            
            firstMove = false;
        }
        //response in boolean
        return returnVal;
    }

     public boolean isCollision(int x, int y, Board b){
        if (x == xPos){
            int incDec = 1;
            if(y < yPos){ incDec = -1;}
            for (int ySearch = yPos + incDec; ySearch < y ; ySearch+=incDec){
                if(b.getPiece(x, ySearch).getPieceValue() != 0){
                    return true;
                }
            }
        }
        return false;
    }
}
