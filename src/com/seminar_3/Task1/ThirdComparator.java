package com.seminar_3.Task1;

import java.util.Comparator;

//Сортировка по возрасту
public class ThirdComparator implements Comparator<Nephews> {

    @Override
    public int compare(Nephews e1, Nephews e2) {
        if (e1.age < e2.age) {
            return -1;
        } else if (e1.age > e2.age) {
            return 1;
        } else {
            return (e1.age).compareTo(e2.age);
        }
    }
}
