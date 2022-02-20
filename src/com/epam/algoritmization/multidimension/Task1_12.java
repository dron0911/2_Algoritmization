package com.epam.algoritmization.multidimension;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */
public class Task1_12 {
    public static void main(String[] args) {
        int[][] array = ArraysUtil.randomArrOfArrOfInt();
        ResultPrinter.printMultiDimArray(array);
        ResultPrinter.printMultiDimArray(sortRows(array));
    }

    private static int[][] sortRows(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                ArraysUtil.bubbleSort(array[i]);
            } else {
                ArraysUtil.selectionSort(array[i]);
            }
        }
        return array;
    }
}
