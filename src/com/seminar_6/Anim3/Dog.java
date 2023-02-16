package com.seminar_6.Anim3;

public class Dog extends AbstractAnimal implements Legs {

    // определение вида домашнего животного
    @Override
    public String getType() {
        return "Пёс";
    }

    // определение количества лап
    @Override
    public int getLegsCount() {
        return 4;
    }
}


