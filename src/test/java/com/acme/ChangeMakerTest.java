package com.acme;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for the ChangeMaker class.
 */
public class ChangeMakerTest {
    @Test
    public void shouldAnswerWithTheExpectedValue() {
        String expected = "5 quarters, 1 dimes, 0 nickels, 2 pennies";
        ChangeMaker changeMaker = new ChangeMaker();
        assertEquals(expected, changeMaker.makeChange(137));
    }
}
