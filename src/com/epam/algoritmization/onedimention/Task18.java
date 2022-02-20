package com.epam.algoritmization.onedimention;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ConsoleReader;
import com.epam.algoritmization.util.ResultPrinter;

import java.util.Arrays;

/**
 * 18. Дана последовательность действительных чисел a1, a2, an.
 * Указать те ее элементы, которые принадлежат отрезку [с, d].
 */

public class Task18 {
    public static void main(String[] args) {
        int[] array = ArraysUtil.createRandOneDimArrayOfInt();
        ResultPrinter.printOneDimArrayOfInt(array);
        ResultPrinter.printOneDimArrayOfInt(isBelongTo(array));
    }

    public static int[] isBelongTo(int[] array) {
        int c = ConsoleReader.readIntValue("Enter c value: ");
        int d = ConsoleReader.readIntValue("Enter d value: ");
        int[] arrayOfOwned = new int[array.length];
        int count = 0;
        for (int j : array) {
            if (j >= c && j <= d) {
                arrayOfOwned[count++] = j;

            }
        }
        return ArraysUtil.bubbleSort(Arrays.copyOf(arrayOfOwned, count));
    }
}
