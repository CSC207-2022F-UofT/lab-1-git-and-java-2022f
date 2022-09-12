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

    @Test(timeout = 1000)
    public void testExampleStudent() {
        String expected = "Hello! My name is Stu Dent! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.exampleStudent();
        assertEquals(expected, actual);
    }

    @Test(timeout = 1000)
    public void testchangs70() {
        String expected = "Hello! My name is Seongmin! " +
                "I like cats more than dogs! I like cats.";
        String actual = IntroLab.changs70();
        assertEquals(expected, actual);
        /* TODO: Write a test case for the method you wrote in IntroLab.
         *       If done properly, you should be able to run IntroLabTest and see
         *       the test results.
         * As a reference, we've included testExampleStudent above.
         */
    }
}
