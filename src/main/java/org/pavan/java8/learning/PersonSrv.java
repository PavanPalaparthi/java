package org.pavan.java8.learning;

import java.util.List;

/**
 * @author pavan palaparthi - mail2pavankp@gmail.com
 */
public interface PersonSrv {
    void add(Person p);

    void update(Person p);

    void delete(Person p);

    List<Person> getAll();

    default boolean exist(Person p) {
        return getAll().contains(p);
    }
}

