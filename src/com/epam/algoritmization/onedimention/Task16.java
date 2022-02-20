package com.epam.algoritmization.onedimention;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ConsoleReader;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 16. Определить количество элементов последовательности натуральных чисел,
 * кратных числу М и заключенных в промежутке от L до N.
 */
public class Task16 {
    public static void main(String[] args) {
        int[] array = ArraysUtil.createRandOneDimArrayOfInt();
        ResultPrinter.printOneDimArrayOfInt(array);
        int count = countOfMultiplesValues(array);
        System.out.println("Count of multiples values: " + count);
    }

    public static int countOfMultiplesValues(int[] array) {
        int count = 0;
        int m = ConsoleReader.readIntValue("Enter M value");
        int l = ConsoleReader.readIntValue("Enter L value");
        int n = ConsoleReader.readIntValue("Enter N value");
        for (int j : array) {
            count = (j % m == 0 && j > l && j < n) ? count + 1 : count;
        }
        return count;
    }
}
