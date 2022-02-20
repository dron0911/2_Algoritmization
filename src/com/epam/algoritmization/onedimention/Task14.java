package com.epam.algoritmization.onedimention;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 14. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой
 * оси, содержащую все эти числа
 */

public class Task14 {
    public static void main(String[] args) {
        int[] array = ArraysUtil.createOneDimArrayOfInt();
        ResultPrinter.printOneDimArrayOfInt(array);
        System.out.println(minLengthOfNumericalAxis(array));
    }

    public static int minLengthOfNumericalAxis(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        return max - min;
    }
}
