/**
 * This file contains a few exercises to familiarize you with Java.
 * <p>
 * You should read this file from top-to-bottom. Any tasks you are to complete
 * are labelled with TODO!
 */

public class IntroLab {

    /**
     * Returns a message depending on the given greeting, name, message, and
     * whether the caller likes cats or dogs more.
     *
     * Do NOT change this method!
     *
     * @param greeting   A string with a greeting (e.g. "Hello", "Hey")
     * @param name       A string with a name (e.g. "Jonathan", "Lindsey")
     * @param likes_cats A boolean: true if they like cats more than dogs,
     *                   false otherwise.
     * @param message    A message to be printed out.
     * @return A message using the given parameters.
     */
    public static String printLabMessage(String greeting, String name,
                                  boolean likes_cats, String message) {
        String message_to_print = greeting + "! My name is " + name + "! ";

        if (likes_cats) {
            message_to_print += "I like cats more than dogs! ";
        } else {
            message_to_print += "I like dogs more than cats! ";
        }

        return message_to_print + message;
    }

    /* TODO: In the space below, write your our method.
     *       The method should be named with your utorID and should call
     *       printLabMessage with some parameters.
     *
     * As a reference, we've provided the sample method exampleStudent.
     * Make sure you document your method properly!
     */

    /**
     * An example method that calls on printLabMessage.
     */
    public static String exampleStudent() {
        return printLabMessage("Hello", "Stu Dent", true,
                "Welcome to CSC207!");
    }


    public static void main(final String[] args) {
        System.out.println(exampleStudent());

        /* TODO: Add a call to the method you wrote in this main method,
         *        and print the results of it.
         *
         * As a reference, we've provided a sample call to exampleStudent
         * above. Afterwards: run this file to see the output!
         */


    }

    // TODO: Go to test/java/IntroLabTest.java afterwards and complete the TODO.

}
