package com.epam.algoritmization.multidimension;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 18. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с
 * массивом следующие действия:
 * а) вычислить сумму отрицательных элементов в каждой строке;
 * б) определить максимальный элемент в каждой строке;
 * в) переставить местами максимальный и минимальный элементы матрицы.
 */
public class Task18 {
    public static void main(String[] args) {
        int[][] array = ArraysUtil.randomArrOfArrOfInt();
        ResultPrinter.printMultiDimArray(array);
        ResultPrinter.printOneDimArrayOfInt(sumOfNegativeNumbersInRows(array));
        ResultPrinter.printOneDimArrayOfInt(maxElementInEachRows(array));
        ResultPrinter.printMultiDimArray(changeMaxMin(array));
    }

    private static int[] sumOfNegativeNumbersInRows(int[][] array) {
        int[] arraySumOfRows = new int[array.length];
        int count = 0;
        for (int[] ints : array) {
            int sum = 0;
            for (int anInt : ints) {
                sum += Math.min(anInt, 0);
            }
            arraySumOfRows[count++] = sum;
        }
        return arraySumOfRows;
    }

    private static int[] maxElementInEachRows(int[][] array) {
        int[] arrayMaxElement = new int[array.length];
        int count = 0;
        for (int[] ints : array) {
            int max = 0;
            for (int anInt : ints) {
                max = Math.max(max, anInt);
            }
            arrayMaxElement[count++] = max;
        }
        return arrayMaxElement;
    }

    private static int[][] changeMaxMin(int[][] array) {
        int max = ArraysUtil.findMultiDimArrayMax(array);
        int min = ArraysUtil.findMultiDimArrayMin(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == max) {
                    array[i][j] = min;
                } else if (array[i][j] == min) {
                    array[i][j] = max;
                }
            }
        }
        return array;
    }
}
