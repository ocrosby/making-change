package com.denmark;

public class ChangeMaker {
    ChangeMaker() {}
    
    public static String makeChange(int cents) {
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        while (cents > 0) {
            if (cents >= 25) {
                quarters++;
                cents -= 25;
            } else if (cents >= 10) {
                dimes++;
                cents -= 10;
            } else if (cents >= 5) {
                nickels++;
                cents -= 5;
            } else {
                pennies++;
                cents--;
            }
        }
        
        return quarters + " quarters, " + 
               dimes + " dimes, " + 
               nickels + " nickels, " + 
               pennies + " pennies";
    }
}
