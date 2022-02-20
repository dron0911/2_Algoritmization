package com.epam.algoritmization.multidimension;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 13. Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов
 */

public class Task1_13 {
    public static void main(String[] args) {
        int[][] array = ArraysUtil.randomArrOfArrOfInt();
        ResultPrinter.printMultiDimArray(array);
        ResultPrinter.printMultiDimArray(sortColumns(array));
    }

    public static int[][] sortColumns(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            boolean isSorted = false;
            int temp;
            if (j % 2 == 0) {
                //ascending
                while (!isSorted) {
                    isSorted = true;
                    for (int i = 0; i < array.length - 1; i++) {
                        if (array[i][j] > array[i + 1][j]) {
                            temp = array[i][j];
                            array[i][j] = array[i + 1][j];
                            array[i + 1][j] = temp;
                            isSorted = false;

                        }
                    }
                }
            } else {
                //descending
                while (!isSorted) {
                    isSorted = true;
                    for (int i = 0; i < array.length - 1; i++) {
                        if (array[i][j] < array[i + 1][j]) {
                            temp = array[i][j];
                            array[i][j] = array[i + 1][j];
                            array[i + 1][j] = temp;
                            isSorted = false;

                        }
                    }

                }
            }

        }
        return array;
    }
}

