package com.epam.algoritmization.multidimension;

import com.epam.algoritmization.util.ConsoleReader;

/**
 * 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1 1 1 1 1 1
 * 0 1 1 1 1 0
 * 0 0 1 1 0 0
 * 0 1 1 1 1 0
 * 1 1 1 1 1 1
 */


public class Task1_6 {
    public static void main(String[] args) {
        int n = ConsoleReader.readIntValue("Enter n: ");
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (j >= i && j + i < n) || (j <= i && j + i + 1 >= n) ? 1 : 0;
                System.out.printf("%7d", array[i][j]);
            }
            System.out.println();
        }
    }
}
