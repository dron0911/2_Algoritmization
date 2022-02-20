package com.epam.algoritmization.onedimention;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

import java.util.Arrays;

/**
 * 12. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных
 * чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом
 * факте
 */

public class Task12 {
    public static void main(String[] args) {
        int[] array = ArraysUtil.createOneDimArrayOfInt();
        ResultPrinter.printOneDimArrayOfInt(array);
        System.out.println(evenNumbersArray(array));
    }

    public static String evenNumbersArray(int[] array) {
        int count = 0;
        String message = "There are no even numbers in the sequence";
        int[] resultArray = new int[array.length];
        for (int j : array) {
            if (j % 2 == 0) {
                resultArray[count++] = j;
            }
        }
        return count == 0 ? message : Arrays.toString(Arrays.copyOf(resultArray, count));
    }
}
