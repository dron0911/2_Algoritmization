package com.epam.algoritmization.multidimension;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 27. Дана матрица. Вывести на экран все четные строки, то есть с четными
 * номерами.
 */
public class Task27 {
    public static void main(String[] args) {
        int[][] array = ArraysUtil.randomArrOfArrOfInt();
        ResultPrinter.printMultiDimArray(array);
        printEvenRows(array);
    }

    private static void printEvenRows(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) System.out.printf("%7d", array[i][j]);
            }
            System.out.println();
        }
    }
}
