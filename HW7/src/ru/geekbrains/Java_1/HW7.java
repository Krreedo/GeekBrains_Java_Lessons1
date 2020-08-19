package ru.geekbrains.Java_1;



public class HW7 {
    public static void main(String[] args) {
        Plate plate = new Plate(45);
        Cat cat[] = new Cat[10];
        for (int i = 0; i <cat.length; i++) {
            cat[i] = new Cat();
        }
        for (int i = 0; i <cat.length; i++) {
            cat[i].eat(plate);
        }
        for (int i = 0; i <cat.length; i++) {
            System.out.println(cat[i].isFullness());
        }
    }


}
