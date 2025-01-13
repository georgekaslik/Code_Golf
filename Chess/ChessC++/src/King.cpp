#include "King.h"

King::King(int x, int y, int pieceValue) : Piece(x, y, pieceValue)
    {
        if(pieceValue > 0) //white
            pieceIcon = 'K';
        else
            pieceIcon = 'k';
    }