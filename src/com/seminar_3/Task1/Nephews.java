package com.seminar_3.Task1;

public class Nephews {

    public int id;
    public String name;
    public Integer age;


    Nephews() {
    }


    public Nephews(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "" + this.id + " "
                + this.name + " "
                + this.age;
    }
}


