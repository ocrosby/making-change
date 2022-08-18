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
        String expected = "5 quarters, 1 dimes, 0 nickels, 2 pennies";
        assertEquals(expected, ChangeMaker.makeChange(137));
    }

    @Test
    public void shouldAnswerWithTheExpectedValue_100() {
        String expected = "4 quarters, 0 dimes, 0 nickels, 0 pennies";
        assertEquals(expected, ChangeMaker.makeChange(100));
    }

}
