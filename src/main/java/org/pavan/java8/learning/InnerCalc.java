package org.pavan.java8.learning;

import java.util.function.Supplier;

/**
 * @author pavan palaparthi - mail2pavankp@gmail.com
 */
public class InnerCalc {

    public boolean getValue(Supplier<String> supplier, String maString) {
        String supp = supplier.get();
        if (supp.contains(maString)) {
            System.out.println("Yahouuu on est en " + maString);
        } else {
            String subSequence = (String) supp.subSequence(0, 2);
//            System.out.println(subSequence.contains((String)maString.subSequence(0, 2)));
            System.out.println("Oupppss on n'as pas la valeur : " + maString + " dans : " + supp);
        }
        return supp.contains(maString);
    }
}
