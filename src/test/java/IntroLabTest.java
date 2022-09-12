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

    /* TODO: Write a test case for the method you wrote in IntroLab.
     *       If done properly, you should be able to run IntroLabTest and see
     *       the test results.
     * As a reference, we've included testExampleStudent above.
     */
    @Test(timeout = 10)
    public void testzhaoy271() {
        String expected = "Greetings, traveller! My name is Kevin Zhao! " +
                "I like cats more than dogs! STOP! You violated the law. " +
                "Pay the court a fine or serve your sentence. Your stolen goods are now forfeit.";
        String actual = IntroLab.zhaoy271();
        assertEquals(expected, actual);
    }
}
