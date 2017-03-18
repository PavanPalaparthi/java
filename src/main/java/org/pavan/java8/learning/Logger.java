package org.pavan.java8.learning;

/**
 * @author pavan palaparthi - mail2pavankp@gmail.com
 */
@FunctionalInterface
public interface Logger {

    /**
     * This functional interface created for inject our logger dependancies
     * inner my own code.
     *
     * @param message use to devlivre a simple message of my code.
     * @param level used for caracterize type of log. <br>
     * 1 - error 2 - simple log 3 - warning
     */
    public void log(String message, int level);
}
