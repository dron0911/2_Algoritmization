package com.epam.algoritmization.multidimension;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;


/**
 * 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
 */
public class Task1_2 {
    public static void main(String[] args) {
        int[][] array = ArraysUtil.randomArrOfArrOfInt();
        ResultPrinter.printMultiDimArray(array);
        elementsOnDiagonal(array);
    }

    private static void elementsOnDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][i]);
        }
    }
}
