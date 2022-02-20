package com.epam.algoritmization.onedimention;

import com.epam.algoritmization.util.DecompositionUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
 * порядковые номера которых являются простыми числами.
 */
public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        ResultPrinter.printOneDimArrayOfInt(array);
        ResultPrinter.printInt("Sum = ", sumOfPrimeNumbers(array));
    }

    public static int sumOfPrimeNumbers(int[] array) {
        int sum = 0;
        for (int i = 2; i < array.length; i++) {
            if (DecompositionUtil.isSimple(i)) {
                sum += array[i];
            }
        }
        return sum;
    }
}
