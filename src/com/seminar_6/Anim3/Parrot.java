package com.seminar_6.Anim3;

public class Parrot extends AbstractAnimal implements Legs {
    // определение вида домашнего животного
    @Override
    public String getType() {
        return "Попугай";
    }

    // определение количества лап
    @Override

    public int getLegsCount() {
        return 2;
    }

}
