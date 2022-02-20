package com.epam.algoritmization.multidimension;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 28. Дана матрица. Вывести на экран первую и последнюю строки
 */
public class Task28 {
    public static void main(String[] args) {
        int[][] array = ArraysUtil.randomArrOfArrOfInt();
        ResultPrinter.printMultiDimArray(array);
        printFirstAndLastRows(array);
    }

    private static void printFirstAndLastRows(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 || i == array.length - 1) {
                    System.out.printf("%7d", array[i][j]);
                } else System.out.print("");
            }

        }
    }
}

