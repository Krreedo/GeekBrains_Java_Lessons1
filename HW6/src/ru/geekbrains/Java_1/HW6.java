package ru.geekbrains.Java_1;

import ru.geekbrains.Java_1.animals.Cat;
import ru.geekbrains.Java_1.animals.Dog;

public class HW6 {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Барни",8,200,2,0,6);
        Cat cat2 = new Cat("Харви",2,189,1.58f,0,9);
        Dog dog1 = new Dog("Хлоя",1,900,0.3f,0,3);
        Dog dog2 = new Dog("Дарк", 7,1500,1.5f,20,10);
        cat1.swim(6);
        cat1.run(148);
        cat2.jump(2);
        dog1.swim(5);
        dog1.run(500);
        dog2.run(1000);
        dog2.swim(10);
    }
}
