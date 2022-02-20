package com.epam.algoritmization.multidimension;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class Task1_15 {
    public static void main(String[] args) {
        int[][] array = ArraysUtil.randomArrOfArrOfInt();
        ResultPrinter.printMultiDimArray(array);
        ResultPrinter.printMultiDimArray(changeOddNumbersOnMax(array));
    }

    private static int[][] changeOddNumbersOnMax(int[][] array) {
        int max = ArraysUtil.findMultiDimArrayMax(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (array[i][j] % 2 != 0) ? max : array[i][j];
            }
        }
        return array;
    }
}
