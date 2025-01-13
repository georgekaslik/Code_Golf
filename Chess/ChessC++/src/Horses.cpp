#include "Horses.h"

Horses::Horses(int x, int y, int pieceValue) : Piece(x, y, pieceValue)
    {
        if(pieceValue > 0) //white
            pieceIcon = 'H';
        else
            pieceIcon = 'h';
    }