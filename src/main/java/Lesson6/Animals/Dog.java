package Lesson6.Animals;

import Lesson6.Animals.Animal;

public class Dog extends Animal {
    protected static int dogCount = 0;

    public Dog(String name) {
        this.name = name;
        Dog.addAnimalCount();
        Animal.addAnimalCount();
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println("Пёс " + name + " пробежал только 200 м. из " + distance + " м.");
        } else
            System.out.println("Пёс " + name + " пробежал " + distance + " м.");
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Пёс " + name + " проплыл только 10 м. из " + distance + " м. и утонул");
        } else
            System.out.println("Пёс " + name + " проплыл " + distance + " м.");
    }


    public static int addAnimalCount() {
        dogCount++;
        return dogCount;
    }

}
