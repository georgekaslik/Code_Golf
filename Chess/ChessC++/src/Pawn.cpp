#include "Pawn.h"

Pawn::Pawn(int x, int y, int pieceValue) : Piece(x, y, pieceValue)
    {
        if(pieceValue > 0) //white
            pieceIcon = 'P';//0x2659;
        else
            pieceIcon = 'p';//0x265F;
    }