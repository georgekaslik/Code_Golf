// C++

#include <iostream>
#include <string>

int main() {
    int x = 99;
    std::string q = "no more";
    std::string y = " bottles of beer";
    std::string g = " on the wall, ";
    std::string m = " on the wall.";
    std::string l = " bottle of beer";
    std::string z = " bottles of beer";
    std::string n = "Take one down and pass it around, ";
    std::string j = "no more bottles of beer on the wall.";
    std::string f = "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.";

    for (; x >= 2; x--) {
        std::cout << x << y << g << x << z << "." <<"\n" << n << (x - 1) << z << m << "\n" << std::endl;
    }
    if (x == 1) {
        std::cout << x << l << g << x << l << "." <<"\n" << n << q << y << m << "\n" << std::endl;
        std::cout << f << std::endl;
    }

    return 0;
}
