package com.seminar_3.Task2;


public class Nephews2 {

    public int id;
    public String name;
    public Integer age;

    Nephews2() {
    }

    Nephews2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "" + this.id + " " + this.name + " "
                + this.age;
    }
}
