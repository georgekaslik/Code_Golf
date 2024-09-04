#include <stdio.h>
int main(int c, char *v[]) {
    for (int i = 1; i < c; i++) printf("%s\n", v[i]);
    for (int i = 99; i > 0; i--) {
        printf("%d bottle%s of beer on the wall, %d bottle%s of beer.\n", i, i > 1 ? "s" : "", i, i > 1 ? "s" : "");
        if (i - 1) {
            printf("Take one down and pass it around, %d bottle%s of beer on the wall.\n\n", i - 1, (i - 1) > 1 ? "s" : "");
        } else {
            printf("Take one down and pass it around, no more bottles of beer on the wall.\n\n");
        }
    }
    printf("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n");
    return 0;
}