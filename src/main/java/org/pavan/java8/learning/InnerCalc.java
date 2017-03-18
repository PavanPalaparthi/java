package org.pavan.java8.learning;

import java.util.function.Supplier;

/**
 * @author pavan palaparthi - mail2pavankp@gmail.com
 */
public class InnerCalc {

    public boolean getValue(Supplier<String> supplier, String myString) {
        String supp = supplier.get();
        if (supp.contains(myString)) {
            System.out.println("my string " + myString);
        } else {
            String subSequence = (String) supp.subSequence(0, 2);
//            System.out.println(subSequence.contains((String)maString.subSequence(0, 2)));
            System.out.println("My string is : " + myString + " supp : " + supp);
        }
        return supp.contains(myString);
    }
}
