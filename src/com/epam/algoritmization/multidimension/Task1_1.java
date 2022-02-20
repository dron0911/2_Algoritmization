package com.epam.algoritmization.multidimension;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый
 * элемент больше последнего.
 */

public class Task1_1 {
    public static void main(String[] args) {
        int[][] array = ArraysUtil.randomArrOfArrOfInt();
        ResultPrinter.printMultiDimArray(array);
        printNotEvenColumns(array);
    }

    private static void printNotEvenColumns(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                if (j % 2 != 0 && array[0][j] > array[array.length - 1][j]) System.out.printf("%7d", ints[j]);
            }
            System.out.println();
        }
    }
}
