package org.app;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User a, User b) {
        return b.getAge()-a.getAge();
    }
}
