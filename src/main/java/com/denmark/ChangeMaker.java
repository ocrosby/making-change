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

        String result = "";

        if (quarters == 1) {
            result += quarters + " quarter, ";
        } else {
            result += quarters + " quarters, ";
        }

        if (dimes == 1) {
            result += dimes + " dime, ";
        } else {
            result += dimes + " dimes, ";
        }

        if (nickels == 1) {
            result += nickels + " nickel, ";
        } else {
            result += nickels + " nickels, ";
        }

        if (pennies == 1) {
            result += pennies + " penny";
        } else {
            result += pennies + " pennies";
        }
        
        return result;
    }
}
