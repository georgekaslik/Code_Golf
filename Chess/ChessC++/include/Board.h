#ifndef BOARD_H
#define BOARD_H

#include "Pieces.h"
#include <vector>

class Board {
    private:
        int xSize;
        int ySize;
        Piece board[8][8];

    public:
        Board();
        void populateBoard();
        void print();
};
#endif