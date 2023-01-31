package com.seminar_3.Task2;


import java.util.TreeSet;

public class FamilyTree4 {

    public static void main(String[] args) {
        System.out.println(
                "Сортировка племянников по алфавиту");

//передача компаратора с использованием лямбда-выражений

        TreeSet<Nephews2> gfg
                = new TreeSet<>((Nephews2 e1, Nephews2 e2)
                ->
                -(e2.name).compareTo(e1.name));

        gfg.add(new Nephews2(1, "Миша", 14));
        gfg.add(new Nephews2(2, "Лена", 20));
        gfg.add(new Nephews2(3, "Ася", 16));
        gfg.add(new Nephews2(4, "Рома", 5));

        for (Nephews2 nephews2 : gfg) {
            System.out.println(nephews2);
        }

        System.out.println(
                "Сортировка  племянников по возрасту");

        TreeSet<Nephews2> gfg2
                = new TreeSet<>((Nephews2 e1,
                                 Nephews2 e2) -> (e1.age).compareTo(e2.age));


        gfg2.add(new Nephews2(1, "Миша", 14));
        gfg2.add(new Nephews2(2, "Лена", 20));
        gfg2.add(new Nephews2(3, "Ася", 16));
        gfg2.add(new Nephews2(4, "Рома", 5));


        for (Nephews2 nephews2 : gfg2) {
            System.out.println(nephews2);
        }
    }

}
