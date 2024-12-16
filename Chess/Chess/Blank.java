
/**
 * Write a description of class Blank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Blank extends Piece
{
    /**
     * Constructor for objects of class Blank
     */
    public Blank(int x, int y)
    {
        super(x,y,0);
        // initialise instance variables
        if((x%2 == 0 && y%2 == 0) || (x%2 != 0 && y%2 != 0)) //white
            this.pieceIcon = 0x25A1;
        else
            this.pieceIcon = 0x25A0;
    }


}
