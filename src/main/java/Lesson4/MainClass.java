package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_0)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
  }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x = -1;
        int y = -1;
        boolean ai_win = false;
        boolean user_win = false;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWin(DOT_X)) {
                        x = i;
                        y = j;
                        user_win = true;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        if (!user_win) {
            do {
                Random rnd = new Random();
                x = rnd.nextInt(SIZE);
                y = rnd.nextInt(SIZE);
            }
            while (!isCellValid(x, y));
        }
        map[x][y] = DOT_0;
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
    }

    public static boolean checkLine(int startX, int startY, int dx, int dy, char sign) {
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[startX + i * dx][startY + i * dy] != sign)
                return false;
        }
        return true;
    }

    public static boolean checkWin(char sign) {
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            for (int j = 0; j <= (SIZE - DOTS_TO_WIN); j++) {
                if (checkLine(i, j, 0, 1, sign)) return true;
                if (checkLine(j, i, 1, 0, sign)) return true;

                if (checkLine(0, j, 1, 1, sign)) return true;
                if (checkLine(j, 0, 1, 1, sign)) return true;
                if (checkLine(j, j, 1, 1, sign)) return true;

                if (checkLine(0, SIZE - 1 - j, 1, -1, sign)) return true;
                if (checkLine(j, SIZE - 1 - 0, 1, -1, sign)) return true;
                if (checkLine(j, SIZE - 1 - j, 1, -1, sign)) return true;
            }
        }
        return false;
    }
}
