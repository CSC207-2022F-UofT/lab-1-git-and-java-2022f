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

    @Test
    public void testExampleStudent() {
        String expected = "Hello! My name is Stu Dent! I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.exampleStudent();
        assertEquals(expected, actual);
    }

    @Test
    public void testHeyixua9() {
        String expected = "o/! My name is Welna! I like cats more than dogs! Pogchamp";
        String actual = IntroLab.heyixua9();
        assertEquals(expected, actual);
    }
}
