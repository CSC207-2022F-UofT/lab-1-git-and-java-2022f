/*
 * This file contains JUnit test cases for IntroLab.java
 *
 * Complete the TODO in this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class IntroLabTest {
    @Before
    public void setUp() {
    }


    @After
    public void tearDown() {
    }

    @Test(timeout = 10000)
    public void testExampleStudent() {
        String expected = "Hello! My name is Ethan Seet! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.eth178();
        assertEquals(expected, actual);
    }
}
