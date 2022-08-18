package com.denmark;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.denmark.ChangeMaker;

/**
 * Unit tests for the ChangeMaker class.
 */
public class ChangeMakerTest {
    @Test
    public void shouldAnswerWithTheExpectedValue_137() {
        String expected = "5 quarters, 1 dime, 0 nickels, 2 pennies";
        assertEquals(expected, ChangeMaker.makeChange(137));
    }

    @Test
    public void shouldAnswerWithTheExpectedValue_100() {
        String expected = "4 quarters, 0 dimes, 0 nickels, 0 pennies";
        assertEquals(expected, ChangeMaker.makeChange(100));
    }

    @Test
    public void shouldAnswerWithTheExpectedValue_zero() {
        String expected = "0 quarters, 0 dimes, 0 nickels, 0 pennies";
        assertEquals(expected, ChangeMaker.makeChange(0));
    }        

    @Test
    public void shouldAnswerWithTheExpectedValue_negative() {
        String expected = "0 quarters, 0 dimes, 0 nickels, 0 pennies";
        assertEquals(expected, ChangeMaker.makeChange(-20));
    }    
}
