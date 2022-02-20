package com.epam.algoritmization.onedimention;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 17. Дан одномерный массив A[N]. Найти:
 * max(четных) + min(нечетных).
 */

public class Task17 {
    public static void main(String[] args) {
        int[] array = ArraysUtil.createRandOneDimArrayOfInt();
        ResultPrinter.printOneDimArrayOfInt(array);
        int sum = sumOfMaxMin(array);
        System.out.println("Sum is equal: " + sum);
    }

    public static int sumOfMaxMin(int[] array) {
        int max = 0;
        int min = 0;
        for (int j : array) {
            max = j % 2 == 0 ? ArraysUtil.findArrayMax(array) : max;
            min = j % 2 != 0 ? ArraysUtil.findArrayMin(array) : min;
        }
        return max + min;
    }
}
