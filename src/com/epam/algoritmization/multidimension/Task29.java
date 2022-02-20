package com.epam.algoritmization.multidimension;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 29. Дана матрица. Вывести на экран первый и последний столбцы.
 */

public class Task29 {
    public static void main(String[] args) {
        int[][] array = ArraysUtil.randomArrOfArrOfInt();
        ResultPrinter.printMultiDimArray(array);
        printFirstAndLastColumns(array);
    }

     private static void printFirstAndLastColumns(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0 || j == array.length - 1) {
                    System.out.printf("%7d", array[i][j]);
                } else System.out.print("");
            }
            System.out.println();
        }
    }
}
