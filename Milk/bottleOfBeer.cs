int x = 99;
for (int i = x; i > 0; i--)
{
    string bottleWord = i == 1 ? "bottle" : "bottles";
    string nextBottleWord = (i - 1) == 1 ? "bottle" : "bottles";
    if (i > 1)
    {
        Console.WriteLine($"{i} {bottleWord} of beer on the wall, {i} {bottleWord} of beer.");
        Console.WriteLine($"Take one down and pass it around, {i - 1} {nextBottleWord} of beer on the wall.\n");
    }
    else
    {
        Console.WriteLine($"{i} {bottleWord} of beer on the wall, {i} {bottleWord} of beer.");
        Console.WriteLine($"Take one down and pass it around, no more bottles of beer on the wall.\n");
    }
}
Console.WriteLine("No more bottles of beer on the wall, no more bottles of beer.");
Console.WriteLine("Go to the store and buy some more, 99 bottles of beer on the wall.");
