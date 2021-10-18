package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println("Name: " + name + ", hungry: " + isHungry);
    }

    public void eat(Plate plate) {
        if (plate.checkPlate(appetite) == true) {
            plate.decreaseFood(appetite);
            isHungry = false;
            System.out.println(name + " поел из тарелки");
        } else {
            System.out.println("Еды не достаточно");
        }
    }

}
