package Lesson6;

import Lesson6.Animals.Animal;
import Lesson6.Animals.Cat;
import Lesson6.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Томас");
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Тузик");

        cat1.run(250);
        cat1.swim(300);

        cat2.run(1000);
        cat2.swim(400);

        dog1.run(600);
        dog1.swim(150);

        dog2.run(3);
        dog2.swim(5);

        System.out.println("Количество созданных животных: " + Animal.getAnimalCount());
        System.out.println("Количество созданных котов: " + Cat.getCatCount());
        System.out.println("Количество созданных собак: " + Dog.getDogCount());
    }
}
