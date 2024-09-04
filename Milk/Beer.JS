for (let i = 99; i > 0; i--) {
    console.log(`${i} bottle${i > 1 ? 's' : ''} of beer on the wall, ${i} bottle${i > 1 ? 's' : ''} of beer.`);
    console.log(`Take one down and pass it around, ${i - 1 > 0 ? (i - 1) + ' bottle' + (i - 1 > 1 ? 's' : '') : 'no more bottles'} of beer on the wall.\n`);
}
console.log("No more bottles of beer on the wall, no more bottles of beer.");
console.log("Go to the store and buy some more, 99 bottles of beer on the wall.");