package com.epam.algoritmization.onedimention;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в
 * нем отрицательных, положительных и нулевых элементов.
 */
public class Task3 {
    public static void main(String[] args) {
        double[] array = ArraysUtil.createOneDimArrayOfDouble();
        ResultPrinter.printOneDimArrayOfDouble(array);
        printCount(array);
    }

    public static void printCount(double[] array) {
        int[] result = new int[3];
        for (double arr : array) {
            if (arr < 0) {
                result[0]++;
            } else if (arr == 0) {
                result[1]++;
            } else if (arr > 0) {
                result[2]++;
            }
        }
        System.out.println("\nCount of negative: " + result[0]);
        System.out.println("Count of zero: " + result[1]);
        System.out.println("Count of positive: " + result[2]);
    }
}
