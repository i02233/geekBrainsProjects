package Lesson6.Animals;

import Lesson6.Animals.Animal;

public class Cat extends Animal {
    protected static int catCount = 0;

    public Cat(String name) {
        this.name = name;
        Cat.addAnimalCount();
        Animal.addAnimalCount();
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println("Кот " + name + " пробежал только 500 м. из " + distance + " м.");
        } else
            System.out.println("Кот " + name + " пробежал " + distance + " м.");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот " + name + " не умеет плавать");
    }


    public static int addAnimalCount() {
        catCount++;
        return catCount;
    }

}
