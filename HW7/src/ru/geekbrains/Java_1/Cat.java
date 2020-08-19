package ru.geekbrains.Java_1;

import java.util.Random;

public class Cat {
    Random random = new Random();
    private String name;
    private int appetite;
    private String[] catNames = {"Гарфилд", "Том", "Гудвин", "Рокки", "Ленивец", "Пушок", "Спорти", "Бегемот", "Пират", "Барни", "Гудини", "Зорро", "Саймон", "Альбус", "Базилио", "Леопольд", "Нарцисс", "Атос", "Каспер", "Валли"};

    public String getCatName() {
        String catName = catNames[random.nextInt(catNames.length-1)];
        return catName;
    }

    public Cat() {
        this.name = getCatName();
        this.appetite = random.nextInt(10)+10;
    }

    public String getName() {
        return name;
    }
    private boolean fullness;

    public String isFullness() {
        String full = "Котик " + name +" сыт";
        String notFull = "Котик " + name + " не поел";
        if(fullness){
            return full;
        } else {
            return notFull;
        }

    }

    public void eat(Plate plate) {
        System.out.println(name + " eat");
        plate.decreaseFood(appetite);
        if (plate.getFood()>0){
            fullness = true;
            System.out.println("В миске осталось " + plate);
        } else {
            fullness = false;
            System.out.println("Кошка отказалась есть, еды в миске не хватает.");
            plate.decreaseFood(-appetite);
            plate.setFood(45);
        }

    }
    }

