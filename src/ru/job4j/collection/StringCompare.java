package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int lowest = Math.min(left.length(), right.length());
        for (int i = 0; i < lowest; i++) {
            int rsl = Character.compare(left.charAt(i), right.charAt(i));
            if (rsl == 0) {
                if (i == lowest - 1) {
                    return Integer.compare(left.length(), right.length());
                }
            } else {
                return rsl;
            }
        }
        return 0;
    }
}