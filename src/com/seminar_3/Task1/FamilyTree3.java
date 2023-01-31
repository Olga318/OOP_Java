package com.seminar_3.Task1;


import java.util.Comparator;
import java.util.TreeSet;

public class FamilyTree3 {

    public static void main(String[] args) {

        System.out.println("Сортировка племянников по имени в порядке алфавита");


        TreeSet<Nephews> gfg
                = new TreeSet<>((Comparator) new FirstComparator());

        gfg.add(new Nephews(1, "Рома", 4));
        gfg.add(new Nephews(2, "Катя", 8));
        gfg.add(new Nephews(3, "Света", 16));
        gfg.add(new Nephews(4, "Миша", 12));


        for (Nephews nephews : gfg) {
            System.out.println(nephews);
        }
        System.out.println(
                "Сортировка по имени в порядке обратного алфавита");


        TreeSet<Nephews> gfg2
                = new TreeSet<>((Comparator) new SecondComparator());
        gfg2.add(new Nephews(1, "Рома", 4));
        gfg2.add(new Nephews(2, "Катя", 8));
        gfg2.add(new Nephews(3, "Света", 16));
        gfg2.add(new Nephews(4, "Миша", 12));


        for (Nephews nephews : gfg2) {
            System.out.println(nephews);
        }


        System.out.println(
                "Сортировка племянников по возрасту в порядке возрастания");

        TreeSet<Nephews> gfg3
                = new TreeSet<>((Comparator) new ThirdComparator());

        gfg3.add(new Nephews(1, "Рома", 4));
        gfg3.add(new Nephews(2, "Катя", 8));
        gfg3.add(new Nephews(3, "Света", 16));
        gfg3.add(new Nephews(4, "Миша", 12));

        for (Nephews nephews : gfg3) {
            System.out.println(nephews);
        }
    }
}
