#include "Bishop.h"

Bishop::Bishop(int x, int y, int pieceValue) : Piece(x, y, pieceValue)
    {
        if(pieceValue > 0) //white
            pieceIcon = 'B';
        else
            pieceIcon = 'b';
    }