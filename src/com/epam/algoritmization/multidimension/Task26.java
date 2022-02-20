package com.epam.algoritmization.multidimension;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 26. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
 * элементов.
 */

public class Task26 {
    public static void main(String[] args) {
        int[][] array = ArraysUtil.randomArrOfArrOfInt();
        ResultPrinter.printMultiDimArray(array);
        int sum = sumABSNegativeElements(array);
        System.out.println(sum);
    }

    private static int sumABSNegativeElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j % 2 != 0 && array[i][j] <= 0) {
                    sum += Math.abs(array[i][j]);
                }
            }
        }
        return sum;
    }
}
