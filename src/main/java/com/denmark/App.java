package com.denmark;

/**
 * Making Change
 */
public class App 
{
    App() {}

    public static void main( String[] args )
    {
        System.out.println();
        System.out.println("Part 2: Making Change");
        
        // Sample Output: 5 quarters, 1 dimes, 0 nickels, 2 pennies. 
        ChangeMaker.displayChange(137);

        // Sample Output: 4 quarters, 0 dimes, 0 nickels, 0 pennies.
        ChangeMaker.displayChange(100);
    }
}
