package ru.geekbrains.Java_1;

public class Cat {
    private String name;


    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        System.out.println(name + " eat");
        plate.decreaseFood(10);
    }
    }

