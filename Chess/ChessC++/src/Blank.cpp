#include "Blank.h"

Blank::Blank(int x, int y) : Piece(x, y, 0) {
    if ((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0)) //placement
        pieceIcon = '0'; //0x25A1; // white square
    else
        pieceIcon = '1'; //0x25A0; // black square
}