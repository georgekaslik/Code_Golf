

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class testingPieces.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testingPieces
{
    Board board;
    int playersTurn;
    /**
     * Default constructor for test class testingPieces
     */
    public testingPieces()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        board = new Board(8,8);
        playersTurn = 1;
    }

    
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    void movePiece(int x1,int y1,int x2,int y2){
        Piece piece = this.board.getPiece(x1, y1);
        
        if(piece.canMove(x2, y2, playersTurn, board))
        {
            this.board.movePiece(x1, y1 ,x2,y2);  
            playersTurn *= -1;
        }
    }
    
    @Test
    public void RookTestMethod() {
        int xCurrent = 0;
        int yCurrent = 0;
        int x = 0;
        int y = 1;
        playersTurn = 1;
        
        movePiece(xCurrent, yCurrent, x, y);
        
        assertTrue(this.board.getPiece(xCurrent, yCurrent).getPieceValue() == 5);
        assertTrue(this.board.getPiece(x, y).getPieceValue() == 1);
        assertTrue(playersTurn == 1);
        
        movePiece(0, 1, 0, 2);
        
        assertTrue(this.board.getPiece(0, 1).getPieceValue() == 0);
        assertTrue(this.board.getPiece(0, 2).getPieceValue() == 1);
        assertTrue(playersTurn == -1);
    }
}

