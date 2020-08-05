package ru.geekbrains.Java_1.animals;

public abstract class Animals {
    String name;
    int age;
    int runRestrict;
    float jumpRestrict;
    int swimRestrict;

    public Animals() {
    }

    public Animals(String name, int age, int runRestrict, float jumpRestrict, int swimRestrict) {
        this.name = name;
        this.age = age;
        this.runRestrict = runRestrict;
        this.jumpRestrict = jumpRestrict;
        this.swimRestrict = swimRestrict;
    }
    abstract void jump (float jumpHeight);
    abstract void run (int runDistance);
    abstract void swim(int swimDistance);
}
