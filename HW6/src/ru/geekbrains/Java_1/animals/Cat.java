package ru.geekbrains.Java_1.animals;

public class Cat extends Animals {
    int livesCount;

    public Cat(String name, int age, int runRestrict, float jumpRestrict, int swimRestrict, int livesCount) {
        super(name, age, runRestrict, jumpRestrict, swimRestrict);
        this.livesCount = livesCount;
        this.swimRestrict = 0;
        if(runRestrict>200){
            System.out.println();
        }
    }
    @Override
    public void jump (float jumpHeight){
        if(jumpHeight<=jumpRestrict){
            System.out.printf("%s прыгнул на %f метров! %n", name, jumpHeight);
        } else {
            System.out.printf("Упс, %s недопрыгнул! %n", name);
        }
    }
    @Override
    public void run (int runDistance){
        if(runDistance<=runRestrict){
            System.out.printf("%s пробежал на %d метров!%n", name, runDistance);
        } else {
            System.out.printf("Упс, %s не смог пробежать %d метров, и прилег отдохнуть.%n", name,runDistance);
        }
    }
    @Override
    public void swim(int swimDistance){
            System.out.printf("%s боится воды и не пойдет плавать.%n", name);
    }

}
