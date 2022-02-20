package com.epam.algoritmization.util;

public class ResultPrinter {
    //print results
    public static void printInt(String prompt, int result) {
        System.out.println(prompt + result);
    }

    public static void printDouble(String prompt, double result) {
        System.out.println(prompt + result);
    }

    public static void printString(String result) {
        System.out.println(result);
    }

    public static void printString(boolean result, String prompt1, String prompt2) {
        if (result) {
            System.out.print(prompt1);
        } else {
            System.out.print(prompt2);
        }
    }

    public static void printBoolean(boolean result) {
        System.out.println(result);
    }

    //print one-dimensional arrays
    public static void printOneDimArrayOfInt(int[] array) {
        for (int arr : array) {
            System.out.print("(" + arr + ") ");
        }
        System.out.println();
    }

    public static void printOneDimArrayOfDouble(double[] array) {
        for (double arr : array) {
            System.out.printf("(%.2f) ", arr);
        }
        System.out.println();
    }

    //print multi-dimensional arrays
    public static void printMultiDimArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%7d", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
