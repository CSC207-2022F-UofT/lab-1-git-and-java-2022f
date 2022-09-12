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

    @Test(timeout = 10)
    public void testExampleStudent() {
        String expected = "Hello! My name is Stu Dent! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.exampleStudent();
        assertEquals(expected, actual);
    }

    /*
     * As a reference, we've included testExampleStudent above.
     */

    @Test(timeout = 15)
    public void testNatalie() {
        String expected = "Hello there! My name is Natalie! I like dogs more than cats! Peace";
        String actual = IntroLab.duarten1();
        assertEquals(expected, actual);
    }

}
