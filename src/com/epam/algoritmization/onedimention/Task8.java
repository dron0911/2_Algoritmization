package com.epam.algoritmization.onedimention;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

import java.util.Arrays;

/**
 * 8. Дана последовательность целых чисел а1,а2,..., аn. Образовать новую
 * последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn)
 */

public class Task8 {
    public static void main(String[] args) {
        int[] array = ArraysUtil.createRandOneDimArrayOfInt();
        ResultPrinter.printOneDimArrayOfInt(array);
        ResultPrinter.printOneDimArrayOfInt(newArrayWithoutMin(array));
        ResultPrinter.printOneDimArrayOfInt(array);
    }

    public static int[] newArrayWithoutMin(int[] array) {
        int min = ArraysUtil.findArrayMin(array);
        int count = 0;
        int[] resultArray = new int[array.length];
        for (int mas : array) {
            if (mas != min) {
                resultArray[count++] = mas;
            }
        }
        return Arrays.copyOf(resultArray, count);
    }
}
