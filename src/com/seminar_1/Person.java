package com.seminar_1;

class Person extends FamilyTree {
    private String status;

    Person(String s, String n, int a, String st) {
        super(s, n, a);
        setStatus(st);
    }

    Person(String st) {
        super(); // Вызвать конструктор по умолчанию
    }

    @Override
    void speak() {
        System.out.println("Мне пора на работу");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    void showPerson() {
        System.out.println("Статус: " + status);
    }
}