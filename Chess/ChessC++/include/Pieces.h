#ifndef PIECES_H
#define PIECES_H

class Piece {
public:
    Piece();
    Piece(int x, int y, int icon);
    char getIcon();
protected:
    int x;
    int y;
    int pieceIcon;
    int pieceValue;
};

#endif