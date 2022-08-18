package com.denmark;

/**
 * Making Change
 */
public class App 
{
    App() {}

    public static void main( String[] args )
    {
        System.out.println("\nPart 2: Making Change\n");

        // write code that gives exact change with the least number of coins for a given number of cents. Use intermediate variables to help your calculation. 
        // test with different numbers (not just 137)!
        
        // Sample Output: 5 quarters, 1 dimes, 0 nickels, 2 pennies. 
        System.out.println("137 cents:");
        System.out.println(ChangeMaker.makeChange(137));

        System.out.println();

        System.out.println("100 cents");
        System.out.println(ChangeMaker.makeChange(100));
    }
}
