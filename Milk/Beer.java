class Main {
    public static void main(String[] args) {
        for (String arg : args) System.out.println(arg);
        for (int i = 99; i > 0; i--) {
            System.out.println(i + " bottle" + (i > 1 ? "s" : "") + " of beer on the wall, " + i + " bottle" + (i > 1 ? "s" : "") + " of beer.");
            System.out.println("Take one down and pass it around, " + (i - 1 > 0 ? (i - 1) + " bottle" + (i - 1 > 1 ? "s" : "") : "no more bottles") + " of beer on the wall.\n");
        }
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
}