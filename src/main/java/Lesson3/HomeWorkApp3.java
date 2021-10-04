package Lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(invertArray(new int[]{1, 0, 1, 0, 0, 1})));
        System.out.println(Arrays.toString(fillArray()));
        System.out.println(Arrays.toString(changeArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        fillDiagonal(5);
        System.out.println(Arrays.toString(makeArray(5, 3)));
        minMaxArray(new int[]{10, 10, 24, 15, 3, 84, 199, 5000});
        System.out.println(checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println(Arrays.toString(shiftArray(new int[]{1, 2, 5, 7, 20, 50}, 4)));

    }

    public static int[] invertArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static int[] fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static int[] changeArray(int[] arr) {
        //int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    public static void fillDiagonal(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i == j) || (j == (arr.length - 1) - i)) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] makeArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void minMaxArray(int[] arr) {
        int max = arr[1];
        int min = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное значение в массиве = " + min);
        System.out.println("Максимальное значение в массиве = " + max);
    }

    public static boolean checkBalance(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int leftSum = 0;
        int rightSum = sum;
        boolean isMedian = false;
        for (int j = 0; j < arr.length; j++) {
            leftSum += arr[j];
            rightSum -= arr[j];
            if (leftSum == rightSum) {
                isMedian = true;
                break;
            }
        }
        return isMedian;
    }

    public static int[] shiftArray(int[] arr, int n) {
        if (n >= 0) {
            int[] shiftArr = new int[arr.length];
            if (n > arr.length) {
                n = Math.abs(n % arr.length);
            }
            System.arraycopy(arr, n, shiftArr, 0, arr.length - n);
            System.arraycopy(arr, 0, shiftArr, arr.length - n, n);
            return shiftArr;
        }
        return null;
    }

}
