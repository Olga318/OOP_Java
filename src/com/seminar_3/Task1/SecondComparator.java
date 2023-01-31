package com.seminar_3.Task1;

import java.util.Comparator;

public class SecondComparator implements Comparator<Nephews> {
    @Override
    public int compare(Nephews e1, Nephews e2) {
        return -(e1.name).compareTo(e2.name);
    }
}