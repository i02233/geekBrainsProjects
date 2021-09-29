package Lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(within10and20(10,1));
        isPositiveOrNegative(-5);
        System.out.println(isNegative(-5));
        printWordNTimes("Java", 5);
        System.out.println(isLeapYear(2100));
    }

    public static boolean within10and20(int x1, int x2) {
        int result = x1 + x2;
        if (result >= 10 && result <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year%4 != 0) {
            return false;
        } else if (year%100 != 0) {
            return true;
        } else if (year%400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
