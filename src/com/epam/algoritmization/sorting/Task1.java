package com.epam.algoritmization.sorting;

import com.epam.algoritmization.util.ConsoleReader;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 * дополнительный массив.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 8, 9};
        int[] arr2 = {4, 5, 6, 7};
        ResultPrinter.printOneDimArrayOfInt(arr1);
        ResultPrinter.printOneDimArrayOfInt(arr2);
        ResultPrinter.printOneDimArrayOfInt(mergeArray(arr1,arr2));
    }

    private static int[] mergeArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = ConsoleReader.readIntValue("Enter k: ");
        for (int p = 0, i = 0; i < arr3.length; p++, i++) {
            if (i == k) {
                for (int j = 0; j < arr2.length; j++, i++) {
                    arr3[i] = arr2[j];
                }
            }
            arr3[i] = arr1[p];
        }
        return arr3;
    }
}
