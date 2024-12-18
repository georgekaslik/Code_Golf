
/**
 * Write a description of interface Piece here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Piece
{
    protected int xPos;
    protected int yPos;
    protected int pieceValue;
    protected char pieceIcon;
    
    public Piece(){
        this.xPos = 0;
        this.yPos = 0;
        this.pieceValue = 0;
        this.pieceIcon = 0x25A1;
    }
    
    public Piece(int x, int y, int pieceValue)
    {
        this.xPos = x;
        this.yPos = y;
        this.pieceValue = pieceValue;
        this.pieceIcon = 0x25A1;
    }
    
    public char getPiece()
    {
        return pieceIcon;
    }
    
    public int getPieceValue()
    {
        return pieceValue;
    }
    
    public void moveTo(int x, int y)
    {
        xPos = x;
        yPos = y;
    }
    
    public boolean canMove(int x, int y, int playersTurn, Board b)
    {
        return false;
    }
    
    public boolean isCollision(int x, int y, Board b){
        return true;
    }
}
