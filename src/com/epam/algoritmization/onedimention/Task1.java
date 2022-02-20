package com.epam.algoritmization.onedimention;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ConsoleReader;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 1. В массив A [N] занесены натуральные числа.
 * Найти сумму тех элементов, которые кратны данному К
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = ArraysUtil.createRandOneDimArrayOfInt();
        ResultPrinter.printOneDimArrayOfInt(array);
        int sum = sumOfMultiples(array);
        ResultPrinter.printInt("Sum = ", sum);
    }

    private static int sumOfMultiples(int[] array) {
        int sum = 0;
        int k = ConsoleReader.readIntValue("Enter k value: ");
        for (int j : array) {
            if (j % k == 0) {
                sum += j;
            }
        }
        return sum;
    }


}
