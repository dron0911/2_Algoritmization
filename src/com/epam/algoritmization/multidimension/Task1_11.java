package com.epam.algoritmization.multidimension;


import com.epam.algoritmization.util.ResultPrinter;

import java.util.Random;

/**
 * 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму
 * матрицу и номера строк, в которых число 5 встречается три и более раз.
 */
public class Task1_11 {
    public static void main(String[] args) {
        int[][] array = new int[10][20];
        ResultPrinter.printMultiDimArray(fillArray(array));
        numberOfRows(array);
    }

    private static int[][] fillArray(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(16);
            }
        }
        return array;
    }

    private static void numberOfRows(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println("Number: " + (i + 1));
            }
        }
    }
}
