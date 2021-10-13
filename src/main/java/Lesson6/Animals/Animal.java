package Lesson6.Animals;

public abstract class Animal {
    protected static int animalCount = 0;
    protected String name;
    protected final int MAX_RUN = 0;
    protected final int MAX_SWIM = 0;

    public static int getAnimalCount() {
        return animalCount;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int addAnimalCount() {
        animalCount++;
        return animalCount;
    }

}
