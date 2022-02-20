package com.epam.algoritmization.onedimention;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 11. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число
 * встречается раньше - положительное или отрицательное.
 */
public class Task11 {
    public static void main(String[] args) {
        int[] array = ArraysUtil.createOneDimArrayOfInt();
        ResultPrinter.printOneDimArrayOfInt(array);
        System.out.println(positiveOrNegative(array));
    }

    public static String positiveOrNegative(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result = array[i] > 0 ? "positive" : "negative";
        }
        return result;
    }
}
