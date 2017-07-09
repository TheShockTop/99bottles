/**
 * Created by Benton Liu on 09-Jul-17.
 */

/*
GOAL
    Create a program that prints out every line to the song "99 bottles of beer on the wall." This should be a pretty
    simple program, so to make it a bit harder, here are some rules to follow.
RULES
    If you are going to use a list for all of the numbers, do not manually type them all in. Instead, use a built in function.
    Besides the phrase "take one down," you may not type in any numbers/names of numbers directly into your song lyrics.
    Remember, when you reach 1 bottle left, the word "bottles" becomes singular.
    Put a blank line between each verse of the song.

    99 bottles of beer on the wall, 99 bottles of beer.
    Take one down and pass it around, 98 bottles of beer on the wall.
 */
public class BottlesOnTheWall {
    public static void main(String[] args) {
        int numberOfBottles = 99;

        while (numberOfBottles > -1){
            xBottles(numberOfBottles--);
        }
    }

    private static void xBottles(int amount){
        if (amount > 2) {
            System.out.print(amount + " bottles of beer on the wall, ");
            System.out.print(amount + " bottles of beer.");
            System.out.println();
            System.out.print("Take one down and pass it around, ");
            System.out.println(--amount + " bottles of beer on the wall.");
            System.out.println();
        } else if (amount == 2){
            System.out.print(amount + " bottles of beer on the wall, ");
            System.out.print(amount + " bottles of beer.");
            System.out.println();
            System.out.print("Take one down and pass it around, ");
            System.out.println(--amount + " bottle of beer on the wall.");
            System.out.println();
        } else if (amount == 1){
            System.out.print(amount + " bottle of beer on the wall, ");
            System.out.print(amount + " bottle of beer.");
            System.out.println();
            System.out.print("Take one down and pass it around, ");
            amount--;
            System.out.println("no more bottles of beer on the wall.");
            System.out.println();
        } else {
            System.out.print("No more bottles of beer on the wall, no more bottles of beer.");
            System.out.println();
            System.out.print("Go to the store and buy some more, ");
            //amount = 99;
            System.out.println(99 + " bottles of beer on the wall.");
            System.out.println();
        }
    }
}
