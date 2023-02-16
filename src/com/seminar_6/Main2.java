package com.seminar_6;

import com.seminar_6.Anim3.*;
import com.seminar_6.Anim4.Animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Animals dog = new Animals("Dog", 2);
        Animals Parrot = new Animals("Poppy", 1);
        Animals duck = new Animals("duck", 1);
        Animals fish = new Animals("upi", 1);

        List<AbstractAnimal> list1 = new ArrayList<>(Arrays.asList(new Dog(), new Duck(), new Fish()));

        for (var animal : list1) {
            System.out.println(animal.getType());
        }
        List<Legs> list2 = new ArrayList<>(Arrays.asList(new Dog(),new Duck()));
        for (var animal : list2) {
            System.out.println(animal.getLegsCount());
        }
    }

}