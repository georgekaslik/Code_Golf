for x in range(99, 0, -1):
    y = x - 1
    if x == 1:
        print(f"{x} bottle of beer on the wall, {x} bottle of beer.\nTake one down and pass it around, no more bottles of beer on the wall.\n")
    elif y == 1:
        print(f"{x} bottles of beer on the wall, {x} bottles of beer.\nTake one down and pass it around, {y} bottle of beer on the wall.\n")
    else:
        print(f"{x} bottles of beer on the wall, {x} bottles of beer.\nTake one down and pass it around, {y} bottles of beer on the wall.\n")

print("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.")
