package Lesson7;

public class MainApp {

    public static void main(String[] args) {

        Cat [] catArray = new Cat[10];
        catArray[0] = new Cat("Барсик", 7);
        catArray[1] = new Cat("Том",8);
        catArray[2] = new Cat("Томас",3);
        catArray[3] = new Cat("Алекс",11);
        catArray[4] = new Cat("Черныш",4);
        catArray[5] = new Cat("Кузя",9);
        catArray[6] = new Cat("Пушок",6);
        catArray[7] = new Cat("Дымок",5);
        catArray[8] = new Cat("Огонёк",15);
        catArray[9] = new Cat("Гав",24);

        Plate plate = new Plate(24);
        plate.info();
        plate.addFood(36);
        plate.info();

        for (Cat cat : catArray) {
            if (plate.checkPlate(cat.getAppetite()) == true) {
                cat.eat(plate);
                plate.info();
            }
        }

        for (Cat cat : catArray) {
           cat.info();
        }





    }

}
