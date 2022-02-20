package com.epam.algoritmization.multidimension;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 25. Дан двухмерный массив n×n элементов. Определить, сколько раз встречается
 * число 7 среди элементов массива.
 */
public class Task25 {
    public static void main(String[] args) {
        int[][] array = ArraysUtil.randomArrOfArrOfInt();
        ResultPrinter.printMultiDimArray(array);
        int count = howMuchTime(array);
        System.out.println("Number 7 occurs " + count + " times.");
    }

    private static int howMuchTime(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }
}
