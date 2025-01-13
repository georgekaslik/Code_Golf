#include "Queen.h"

Queen::Queen(int x, int y, int pieceValue) : Piece(x, y, pieceValue)
    {
        if(pieceValue > 0) //white
            pieceIcon = 'Q';
        else
            pieceIcon = 'q';
    }