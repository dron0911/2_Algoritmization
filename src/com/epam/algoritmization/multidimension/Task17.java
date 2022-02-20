package com.epam.algoritmization.multidimension;

import com.epam.algoritmization.util.ConsoleReader;

/**
 * 17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1111111111
 * 1000000001
 * 1000000001
 * ..........
 * 1000000001
 * 1111111111
 */

public class Task17 {
    public static void main(String[] args) {
        int n = ConsoleReader.readIntValue("Enter n: ");
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 || i == array.length - 1) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = j == 0 || j == array.length - 1 ? 1 : 0;
                }
                System.out.printf("%7d", array[i][j]);
            }
            System.out.println();
        }
    }
}
