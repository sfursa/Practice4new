package com.company;

public class Person {
    int agg;
    String name;
    String surname;


    void old() {
        int ageLastNumber = agg % 10;

        if (agg % 100 >= 11 && agg % 100 <= 14) {                                    // почему agg % 100
            System.out.println("Вам " + agg + " лет.");
        } else if (ageLastNumber == 1) {
            System.out.println("Вам " + agg + " год.");
        } else if (ageLastNumber >= 5 && ageLastNumber <= 9) {
            System.out.println("Вам " + agg + " лет.");
        } else if (ageLastNumber >= 2 && ageLastNumber <= 4) {
            System.out.println("Вам " + agg + " года.");
        } else if (ageLastNumber == 0) {
            System.out.println("Вам " + agg + " лет.");
        } else if (ageLastNumber < 0) {
            System.out.println("Возраст не определен");
        }
    }

    char yourName() {
        return name.charAt(0);                                                     // что такое name.charAt
    }

    String yourSurname() {
        return surname;
    }

    void result() {
        System.out.println("Вас зовут " + yourSurname() + " " + yourName()+ ".");
    }
}
