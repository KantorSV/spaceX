package org.app;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User q, User w) {
        return w.getAge()-q.getAge();
    }
}
