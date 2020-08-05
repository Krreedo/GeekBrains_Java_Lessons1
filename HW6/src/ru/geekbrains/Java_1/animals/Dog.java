package ru.geekbrains.Java_1.animals;

public class Dog extends Animals{
    int commandsCount;

    public Dog(String name, int age, int runRestrict, float jumpRestrict, int swimRestrict, int commandsCount) {
        super(name, age, runRestrict, jumpRestrict, swimRestrict);
        this.commandsCount = commandsCount;
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
        if(swimDistance<=swimRestrict){
            System.out.printf("%s смог проплыть %d метров!%n", name, swimDistance);
        }else{
            System.out.printf("%s развернулся у берега, так как понял что не сможет проплыть %d метров.%n", name, swimDistance);
        }
    }
}
