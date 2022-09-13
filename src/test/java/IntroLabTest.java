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
        String expected = "Hello! My name is Stu Dent! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.exampleStudent();
        assertEquals(expected, actual);
    }
    @Test
    public void testMyCode() {
        String expected = "Hello! My name is Jerry! I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.wang1978();
        assertEquals(expected, actual);
    }
}

