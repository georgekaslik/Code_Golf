#include "Rook.h"

Rook::Rook(int x, int y, int pieceValue) : Piece(x, y, pieceValue)
    {
        if(pieceValue > 0) //white
            pieceIcon = 'R';
        else
            pieceIcon = 'r';
    }
