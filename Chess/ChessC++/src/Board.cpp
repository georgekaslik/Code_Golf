#include <iostream>
#include "Board.h"
#include "Pieces.h"
#include "Blank.h"
#include "Pawn.h"
#include "Rook.h"
#include "Horses.h"
#include "Bishop.h"
#include "King.h"
#include "Queen.h"

Board::Board() {
    this-> xSize = 8;
    this -> ySize = 8;

    populateBoard();
}

void Board::populateBoard(){
    for (int y = 0; y < 8; y++)
    {
        for (int x = 0; x < 8; x++)
        {
            if (y == 1) // White pawns
            {
                this->board[y][x] = Pawn(x, y, 1);
            }
            else if (y == 6) // Black pawns
            {
                this->board[y][x] = Pawn(x, y, -1);
            }
            else if (y == 0 && (x == 0 || x == 7)) // White rooks
            {
                this->board[y][x] = Rook(x, y, 5);
            }
            else if (y == 7 && (x == 0 || x == 7)) // Black rooks
            {
                this->board[y][x] = Rook(x, y, -5);
            }
            else if (y == 0 && (x == 1 || x == 6)) // White Horses
            {
                this->board[y][x] = Horses(x, y, 3);
            }
            else if (y == 7 && (x == 1 || x == 6)) // Black Horses
            {
                this->board[y][x] = Horses(x, y, -3);
            }
            else if (y == 0 && (x == 2 || x == 5)) // White Bishops
            {
                this->board[y][x] = Bishop(x, y, 3);
            }
            else if (y == 7 && (x == 2 || x == 5)) // Black Bishops
            {
                this->board[y][x] = Bishop(x, y, -3);
            }
            else if (y == 0 && (x == 4)) // White King
            {
                this->board[y][x] = King(x, y, 9);
            }
            else if (y == 7 && (x == 4)) // Black King
            {
                this->board[y][x] = King(x, y, -9);
            }
            else if (y == 0 && (x == 3)) // White Queen
            {
                this->board[y][x] = Queen(x, y, 9);
            }
            else if (y == 7 && (x == 3)) // Black Queen
            {
                this->board[y][x] = Queen(x, y, -9);
            }
            else
            {
                this->board[y][x] = Blank(x, y);
            }
        }
    }
}

void Board::print()
{
    for (int y = 0; y < 8; y++)
    {
        if(y == 0){
            std::cout << " ";
            for (int x = 0; x < 8; x++)
            {
                std::cout << (char)(x + 65);
            }
            std::cout << "\n";
        }
        std::cout << y + 1;
        for (int x = 0; x < 8; x++)
        {
            std::cout << board[y][x].getIcon();
        }
        std::cout << "\n";
    }
}