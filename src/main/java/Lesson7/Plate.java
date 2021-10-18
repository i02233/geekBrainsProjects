package Lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean checkPlate(int amount) {
        if (food - amount >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public int decreaseFood(int amount) {
        if (checkPlate(amount) == true) {
            food -= amount;
        }
        return food;
    }


    public void info() {
        System.out.printf("Plate [ Food: %d ]\n", food);
    }

    public int addFood (int addAmount){
        food += addAmount;
        System.out.println("Хозяин добавил в тарелку " + addAmount + " г. еды");
        return food;
    }


}
