package org.pavan.java8.learning;

/**
 * @author pavan palaparthi - mail2pavankp@gmail.com
 */
public class StringSwitch {

    public void swithInStr(String value) {
        switch (value) {
            case "car":
                break;
            case "bike":
                break;
            case "airplane":
                break;
            default:
                throw new AssertionError();
        }

    }
}
