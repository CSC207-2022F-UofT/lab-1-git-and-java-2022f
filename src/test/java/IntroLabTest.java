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

    @Test(timeout = 10)
    public void testZhuoFeng() {
        String expected = "YOYOYO! My name is sirsheepadoodle! " + "I like cats more than dogs! sheesh that's my cat";
        String actual = IntroLab.zhuoFeng();
        assertEquals(expected, actual);
    }

    /*
     * As a reference, we've included testExampleStudent above.
     */
}
