package com.seminar_1;

class Position {
    public static void main(String[] args) {
        Person s1 = new Person("Петров", "Иван", 54, "Глава семейства");
        Person s2 = new Person("Петрова", "Ирина", 50, "Жена главы семейства");
        Person s3 = new Person("Петрова", "Инна", 14, "Дочь");
        Person s4 = new Person("Петрова", "Елена", 80, "Свекровь");


//        s1.setSurname("Петров");
//        s1.setName("Иван");
//        s1.setAge(54);
//        s1.setStatus("Глава семейства");
//
//        s2.setSurname("Петрова");
//        s2.setName("Ирина");
//        s2.setAge(50);
//        s2.setStatus("Жена главы семейства");
//
//        s3.setSurname("Петрова");
//        s3.setName("Инна");
//        s3.setAge(14);
//        s3.setStatus("Дочь");
//
//        s4.setSurname("Петрова");
//        s4.setName("Елена");
//        s4.setAge(80);
//        s4.setStatus("Свекровь");
//
        System.out.println("Info s1");
        s1.showPerson();
        s1.showInfo();
        s1.speak();

        System.out.println();

        System.out.println("Info s2");
        s2.showPerson();
        s2.showInfo();


        System.out.println();

        System.out.println("Info s3");
        s3.showPerson();
        s3.showInfo();

        System.out.println();

        System.out.println("Info s4");
        s4.showPerson();
        s4.showInfo();
    }
}