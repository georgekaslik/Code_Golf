cmake_minimum_required(VERSION 3.10)
project(Chess)

# Set include directories
include_directories(include)

# Add source files for board and pieces
add_library(Chess_Board STATIC
    src/Board.cpp
    src/Pawn.cpp
    src/Rook.cpp
    src/Horses.cpp
    src/Bishop.cpp
    src/king.cpp
    src/Queen.cpp
    src/Pieces.cpp
    src/Blank.cpp
)

# Link libraries
# target_link_libraries(Chess_Board PRIVATE Chess_Pieces) 

# Create an executable
add_executable(Chess_Game src/main.cpp)
target_link_libraries(Chess_Game PRIVATE Chess_Board) 