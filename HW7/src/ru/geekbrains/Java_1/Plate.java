package ru.geekbrains.Java_1;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void setFood(int food) {
        this.food = food;
        System.out.println("Человек добавил в миску еды");
    }

    @Override
    public String toString() {
        return food +
                " еды.";
    }
}
