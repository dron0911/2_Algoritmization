package com.epam.algoritmization.onedimention;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ConsoleReader;
import com.epam.algoritmization.util.ResultPrinter;

import java.util.Arrays;

/**
 * 13. Даны натуральные числа а1, а2,..., аn. Указать те из них, у которых остаток от
 * деления на М равен L.
 */

public class Task13 {
    public static void main(String[] args) {
        int[] array = ArraysUtil.createRandOneDimArrayOfInt();
        ResultPrinter.printOneDimArrayOfInt(array);
        ResultPrinter.printOneDimArrayOfInt(remainderOfDivision(array));
    }

    public static int[] remainderOfDivision(int[] array) {
        int count = 0;
        int[] resultArray = new int[array.length];
        int m = ConsoleReader.readIntValue("Enter m: ");
        int l = ConsoleReader.readIntValue("Enter l: ");
        for (int j : array) {
            if (j % m == l) {
                resultArray[count++] = j;
            }
        }
        return Arrays.copyOf(resultArray, count);
    }
}
