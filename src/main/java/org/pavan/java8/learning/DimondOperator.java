package org.pavan.java8.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pavan palaparthi - mail2pavankp@gmail.com
 */
public class DimondOperator {
    public List<String> old() {

        List<List<String>> doubleList = new ArrayList<>();

        return doubleList.stream().flatMap(List::stream).collect(Collectors.toList());
    }
}
