package com.seminar_2.Task1;

public abstract class Family {
    private String surname;
    private String name;
    private int age;

    public void speak() {System.out.println("Давай поговорим!");
    }

    public String getSurname() {return surname;
    }

    public void setSurname(String surname) {this.surname = surname;
    }

    public String getName() {return name;
    }

    public void setName(String name) {this.name = name;
    }

    public int getAge() {return age;
    }

    public void setAge(int age) {this.age = age;
    }
}
