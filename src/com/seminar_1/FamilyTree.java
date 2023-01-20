package com.seminar_1;

class FamilyTree {

    private String surname;
    private String name;
    private int age;

    FamilyTree(String s, String n, int a) {
        this.surname = s;
        this.name = n;
        this.age = a;
    }

    FamilyTree() {
        this.surname = null;
        this.name = null;
        this.age = 0;
    }

    @Override
    public String toString() {
        return "FamilyTree{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    void speak() {
        System.out.println("Мне пора на работу");
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age + "лет.");
    }
}


























