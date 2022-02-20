package com.epam.algoritmization.decomposition;

import com.epam.algoritmization.util.ConsoleReader;
import com.epam.algoritmization.util.DecompositionUtil;
import com.epam.algoritmization.util.ResultPrinter;

import java.util.Arrays;

/**
 * 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами
 * которого являются числа, сумма цифр которых равна К и которые не большее N.
 **/

public class Task12 {
    public static void main(String[] args) {
        int k = ConsoleReader.readIntValue("Enter K: ");
        int n = ConsoleReader.readIntValue("Enter N: ");
        ResultPrinter.printOneDimArrayOfInt(fillArray(k, n));
    }

    private static int[] fillArray(int k, int n) {
        int[] array = new int[1000];
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (DecompositionUtil.sumOfDigitsInNumber(i) == k) {
                array[count++] = i;
            }
        }
        return Arrays.copyOf(array, count);
    }
}
