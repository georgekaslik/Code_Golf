#include "Pieces.h"

Piece::Piece(){
    this->x = 0;
    this->y = 0;
    this->pieceIcon = 0;
}

Piece::Piece(int x, int y, int icon){
    this->x = x;
    this->y = y;
    this->pieceIcon = icon;
}

char Piece::getIcon(){
    return this->pieceIcon;
}