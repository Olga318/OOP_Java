package com.seminar_6.Anim3;

public class Duck extends AbstractAnimal implements Legs {

    // определение вида домашнего животного
    @Override
    public String getType(){
        return "Утка";
    }
    // определение количества лап
    @Override
    public int getLegsCount() {
        return 2;
    }
}
