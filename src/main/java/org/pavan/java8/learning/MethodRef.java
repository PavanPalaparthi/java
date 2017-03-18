package org.pavan.java8.learning;

import java.util.Arrays;

/**
 * @author pavan palaparthi - mail2pavankp@gmail.com
 */
public class MethodRef {

    public static void main(String[] args) {
        new MethodRef().sayHello3();
    }

    public void sayHello3() {
        Arrays.asList(1, 2, 3).forEach(this::hello);
    }

    private void hello(int i) {
        System.out.println("Hello " + i);
    }
}
