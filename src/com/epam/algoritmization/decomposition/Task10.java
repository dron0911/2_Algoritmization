package com.epam.algoritmization.decomposition;

import com.epam.algoritmization.util.DecompositionUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 10. Дано натуральное число N. Написать метод(методы) для формирования массива,
 * элементами которого являются цифры числа N.
 */
public class Task10 {
    public static void main(String[] args) {
        int number = 345621565;
        ResultPrinter.printOneDimArrayOfInt(arrayOfNumDigits(number));

    }

    private static int[] arrayOfNumDigits(int n) {
        int[] array = new int[DecompositionUtil.countOfDigitsInNumber(n)];
        for (int i = 0; i < array.length; i++, n /= 10) {
            int copyN = n;
            copyN %= 10;
            array[i] = copyN;
        }
        return array;
    }
}
