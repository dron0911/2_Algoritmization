package com.epam.algoritmization.multidimension;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ConsoleReader;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task1_3 {
    public static void main(String[] args) {
        int[][] array = ArraysUtil.randomArrOfArrOfInt();
        ResultPrinter.printMultiDimArray(array);
        kRows(array);
        pColumns(array);
    }

    private static void kRows(int[][] array) {
        int k = ConsoleReader.readIntValue("Enter k");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == k - 1) {
                    System.out.printf("%7d", array[k][j]);
                }
            }
        }
    }

    private static void pColumns(int[][] array) {
        int p = ConsoleReader.readIntValue("Enter p");
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                if (j == p - 1) {
                    System.out.printf("%7d", ints[p]);
                }
            }
        }
    }
}

