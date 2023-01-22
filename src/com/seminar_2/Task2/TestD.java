package com.seminar_2.Task2;

public class TestD implements Dogs {
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public void travel() {
        System.out.println("Собака гуляет");
    }

    @Override
    public void speak() {
        System.out.println("Гав-гав");
    }
}
